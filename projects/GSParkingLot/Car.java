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
public class Car extends Vehicle{
      public Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }
    public Car(String plateNum){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
        licensePlate = plateNum;
    }
    
    @Override
    public boolean canFitInSpot(Spot spot){
        
        if(spot.getSize() == VehicleSize.Large ||
                spot.getSize() == VehicleSize.Compact)
        return true;
        
        return false;
    }
}
