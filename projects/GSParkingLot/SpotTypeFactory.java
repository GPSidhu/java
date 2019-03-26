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
public final class SpotTypeFactory {
    
    public static SpotType getInstance(SpotType spotType){
        VehicleSize size = spotType.getSize();
        
          if(size == VehicleSize.Small)
            return new Small(spotType);
        else 
            if(size == VehicleSize.Compact)
            return new Compact(spotType);
        else 
            if(size == VehicleSize.Large)
            return new Large(spotType);
          
          return null;
    }
}
