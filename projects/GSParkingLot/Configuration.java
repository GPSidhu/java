/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gfsingh
 */


public class Configuration {
    
    private String parkingLotType;
    //private int smallSpots;
    //private int compactSpots;
    //private int largeSpots;
    
    private List<SpotType> spotTypes;
    
    public Configuration(){
        spotTypes = new ArrayList<>();
    }
    public Configuration(String parkingLotType){
        this.parkingLotType = parkingLotType;
    }
    public void setParkingLotType(String type){
        this.parkingLotType = type;
    }
    
    public String getParkingLotType(){
        return this.parkingLotType;
    }
    
    public void addSpotType(VehicleSize size,int totalCount,int rows,int cols,int startingRow){
        
        if(size == VehicleSize.Small)
            addSpotType(new Small(totalCount,rows,cols,startingRow));
        else 
            if(size == VehicleSize.Compact)
            addSpotType(new Compact(totalCount,rows,cols,startingRow));
        else 
            if(size == VehicleSize.Large)
            addSpotType(new Large(totalCount,rows,cols,startingRow));
        
    }
    
    private void addSpotType(SpotType s){
        this.spotTypes.add(s);
    }
    public List<SpotType> getSpotTypes(){
        return this.spotTypes;
    }
    /*
    public int getSmallSpots(){
        return this.smallSpots;
    }
    public int getCompactSpots(){
        return this.compactSpots;
    }
    public int getLargeSpots(){
        return this.largeSpots;
    }
    */
}
