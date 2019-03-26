/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

import java.util.List;

/**
 *
 * @author gfsingh
 */
public class MultiLevelParkingLot implements ParkingLot {
       
    public MultiLevelParkingLot(Configuration conf){
        
    }
    public int getNumberOfLevels(){return -1;};
    //returns total available spots in whole parking lot
    public int getTotalAvailableSpots(){return -1;};
    //returns total occupied spots in whole parking lot
    public int getTotalOccupiedSpots(){return -1;};
    
    //returns total available spots for given vehicle/spot size
    public int getTotalAvailableSpots(VehicleSize v){return -1;};
    
    //returns total occupied spots for given vehicle/spot size
    public int getTotalOccupiedSpots(VehicleSize v){return -1;};
    
    //returns total available spots for given parking level
    public int getTotalAvailableSpots(ParkingLevel level){return -1;};
    
    //returns total occupied spots for given parking level
    public int getTotalOccupiedSpots(ParkingLevel level){return -1;};
    
    //get total Spot/Vehicle size types supported by parking lot
    @Override
    public List<VehicleSize> getSpotTypes(){return null;};
    
    //for a given input vehicle, return the available spot
    public Spot findParkingSpot(Vehicle vehicle){return null;};
    
    //for a given inut vehicle , allocate the found parking spot
    public boolean allocateParkingSpot(Vehicle vehicle,Spot spot){return true;};
    
    //for an exiting vehicle, free up the parking spot occupied
    public boolean freeParkingSpot(Vehicle vehicle){return false;};
}
