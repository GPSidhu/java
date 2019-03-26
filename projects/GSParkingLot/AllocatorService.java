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
public final class AllocatorService {
    
    private static AllocatorService allocator;
    private static ParkingLot parkingLot;
    
    private AllocatorService(){}
    
    public synchronized static AllocatorService getInstance(ParkingLot pl){

            if(allocator == null){
                parkingLot = pl;
                allocator =  new AllocatorService();
            }                
        return allocator;
    }
    public static ParkingTicket park(Vehicle v){
        Spot sp = parkingLot.findParkingSpot(v);
        
        if(parkingLot.allocateParkingSpot(v, sp)){
            return new ParkingTicket(v);
        }
        
        return new ParkingTicket(-1);
    }
    
    
}
