/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

import java.util.List;
import java.util.Map;

/**
 *
 * @author gfsingh
 */
public class SingleLevelParkingLot implements ParkingLot{
    
    public final int numberOfLevels;
    private final ParkingLevel parkingLevel;
        
    public SingleLevelParkingLot(Configuration conf){
        this.numberOfLevels = 1;     
        this.parkingLevel = new ParkingLevel();
        this.parkingLevel.configureSpots(conf);
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
    public int getTotalAvailableSpots(ParkingLevel level){return -1;}
    
    //returns total occupied spots for given parking level
    public int getTotalOccupiedSpots(ParkingLevel level){return -1;}
    
    //get total Spot/Vehicle size types supported by parking lot
    @Override
    public List<VehicleSize> getSpotTypes(){return null;}
    
    //for a given input vehicle, return the available spot location
    public SpotLocation findParkingSpotLocation(Vehicle vehicle){
        Map<VehicleSize,SpotType> mp = this.parkingLevel.getSpotTypeMap();
        VehicleSize vSize = vehicle.getVehicleSize();
        
        //check if the parking lot supports available vehicle size
        if(mp.containsKey(vSize)){
            SpotType st = mp.get(vSize);
            if(st.isSpotAvailable()){
                SpotLocation loc = st.getAvailableSpot();
            }else
                return null;
        }                
        return null;
    }
    
    public Spot findParkingSpot(Vehicle vehicle){return null;}
    //for a given inut vehicle , allocate the found parking spot
    public boolean allocateParkingSpot(Vehicle vehicle,Spot spot){
    
        SpotLocation loc = findParkingSpotLocation(vehicle);
        
        
        return true;
    }
    
    //for an exiting vehicle, free up the parking spot occupied
    public boolean freeParkingSpot(Vehicle vehicle){return false;};
    
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("SingleLevelParkingLot...");
        str.append(this.parkingLevel.toString());
        return str.toString();
    }

}
