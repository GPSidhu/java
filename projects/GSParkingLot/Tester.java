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
/*
1. Create Configuration object
2. Set parkingLot type => SINGLE_LEVEL,MULTI_LEVEL etc (or pass the string in conf constructor)
3. Set spot types and their count => small,compact,large ,etc
    => For new spot types to be added, the new implementation class must extend the SpotType abstract class
4. 
*/
public class Tester {
    public static void main(String[] args) {
        /******** Create configuration for new Parking Lot *********/
        Configuration conf = new Configuration();
        
        conf.setParkingLotType("Single_Level");
        conf.addSpotType(VehicleSize.Small,21,1,21,1);
        conf.addSpotType(VehicleSize.Compact,11,2,11,2);
        conf.addSpotType(VehicleSize.Large,6,3,6,3);
        
        /*************** Create new Parking Lot object **************/
        ParkingLot parkingLot = ParkingLotFactory.getInstance(conf);
        System.out.println(parkingLot.toString());
        /************************************************************/
        
        
        /********** Create parking lot allocator service object ************/
        AllocatorService allocator  = AllocatorService.getInstance(parkingLot);
        //ps.start();
        /*******************************************************************/
        
        //Vehicles Feed
        Vehicle [] vehicles = { new Car("PB29S9125"),new Car("TS35A9987"),
                                new TwoWheeler("AP28D2341"),new TwoWheeler("HR26GH8971"),
                                new Bus("TS6ED9122"),new Bus("AP5G1243")};
                
        
        
    }
}
