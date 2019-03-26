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
public abstract class Vehicle {
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;
    private Spot spot;
    //private Date inTime;      //enhancements
    //private Date outTime;     //enhancements
            
    public int getSpotsNeeded(){
        return this.spotsNeeded;
    }
    
    public VehicleSize getVehicleSize(){
        return this.size;
    }
    public void parkInSpot(Spot spot){
        this.spot = spot;
    }
    public void clearSpot(){
        this.spot.clearSpot();
    }
    
    public abstract boolean canFitInSpot(Spot spot);
}
