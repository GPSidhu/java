/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

/**
 *
 * @author gfsingh
 */
public class Spot {
    private VehicleSize size;
    private Vehicle vehicle;
    private SpotLocation location;
    
    public Spot(VehicleSize size,ParkingLevel lvl,int row,int spotNumber){
        this.size = size;
        this.vehicle = null;
    }
    
    public boolean isAvailable(){
        return vehicle==null;
    }
    
    public boolean park(Vehicle v){
        if(this.isAvailable() ){
            //check if v.size can be fitted in this.spot
            /* to do */
            
            v.parkInSpot(this);
            //this.level.updateCounter(this.size);
            return true;
        }
        return false;
    }
    public boolean canFitVehicle(Vehicle v){
        /* to do */
        return true;
    }

    public VehicleSize getSize(){
        return this.size;
    }
    public void clearSpot(){
        this.vehicle = null;
    }
}
