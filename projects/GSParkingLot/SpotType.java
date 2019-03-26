/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gfsingh
 */
public abstract class SpotType {
    
    private String spotType;  //Small,Compact,Large   
    private Map<SpotLocation,Spot> availableSpots;
    private Map<SpotLocation,Spot> occupiedSpots;
    private ParkingLevel parkingLevel;
    
    private VehicleSize size;
    private int totalCount;
    private int availableCount;
    
    public SpotType(SpotType sType){
        
        this.spotType = sType.getSpotType();
        this.availableCount = sType.getAvailableCount();
        this.totalCount = sType.getTotalCount();
        this.size = sType.getSize();
        
        this.availableSpots = new HashMap<>(sType.getAllAvailableSpots());
        this.occupiedSpots = new HashMap<>(sType.getAllOccupiedSpots());
    }
    
    public SpotType(int totalCount,int rows,int cols,int startingRow){        
        this.availableSpots = new HashMap<>();
        this.occupiedSpots = new HashMap<>();
        
        this.totalCount = totalCount;
        this.availableCount = totalCount;
        
        int count = 0;
        while(count < totalCount){
            this.availableSpots.put(new SpotLocation(startingRow+count/cols,count%cols+1), null);            
            count++;
        }
    }
    
    public SpotLocation getAvailableSpot(){
        if(this.isSpotAvailable()){
            Map.Entry<SpotLocation,Spot> entry = availableSpots.entrySet().iterator().next();
            return entry.getKey();
        }else
            return null;
    }
    public void setParkingLevel(ParkingLevel level){
        this.parkingLevel = level;
    }
    public String getSpotType(){
        return this.spotType;
    }
    public void setSpotType(String spotType){
        this.spotType = spotType;
    }
    public String getType(){
        return spotType;
    }
    public VehicleSize getSize(){
        return size;
    }
    public void setSize(VehicleSize size){
        this.size = size;
    }
    public void setTotalCount(int count){
        this.totalCount = count;
    }
    public void setAvailableCount(int count){
        this.availableCount = count;
    }
    public int getTotalCount(){
        return this.totalCount;
    }
    public int getAvailableCount(){
        return this.availableCount;
    }
    public Map<SpotLocation,Spot> getAllAvailableSpots(){
        return this.availableSpots;
    }
    public Map<SpotLocation,Spot> getAllOccupiedSpots(){
        return this.occupiedSpots;
    }
    
    public boolean isSpotAvailable(){
        return this.availableCount > 0 ? true:false;
    }
    
    @Override
    public String toString(){
        return "SpotType : "+this.spotType+"\n"
                +"\t\tTotal Count : "+this.totalCount+"\n"
                +"\t\tAvailable Count : "+this.availableCount+"\n";        
    }
}
