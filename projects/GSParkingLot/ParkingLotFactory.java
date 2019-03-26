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
public final class ParkingLotFactory {
    
    public static ParkingLot getInstance(Configuration conf){
        if(conf.getParkingLotType().toUpperCase().equals("SINGLE_LEVEL")){
            System.out.println("Creating SINGLE_LEVEL parking lot object...");
            return new SingleLevelParkingLot(conf);
        }else if(conf.getParkingLotType().toUpperCase().equals("MULTI_LEVEL"))
            return new MultiLevelParkingLot(conf);   
        else
            return null;
    }
}
