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
public class Bus extends Vehicle{
     public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }
    public Bus(String plateNum){
        spotsNeeded = 5;
        size = VehicleSize.Large;
        licensePlate = plateNum;
    }
    
    @Override
    public boolean canFitInSpot(Spot spot){
        
        if(spot.getSize() == VehicleSize.Large)
            return true;
        
        return false;
    }
}
