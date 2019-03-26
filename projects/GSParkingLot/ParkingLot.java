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
/*
Assumptions:
    1. The parking lot has multiple levels. Each level has multiple rows of spots
    2. The parking lot can park motorcycles, cars, and buses. (Scalability for any other type of vehicle)
    3. The parking lot has motorcycle spots, compact spots, and large spots.
    4. A motorcycle can park in any spot.(future:   1 motorcycle can park in 1 small spot, 
                                                    2 motorcycles can park in 1 compact spot
                                                    10 motorcycles can park in 1 large)
    5. A car can park in either a single compact spot or a single large spot.
    6. A bus can park in five large spots that are consecutive and within the same row. It cannot park in small spots.

operations : 
    1. Get total num of motorcycles,cars,buses etc parked (total or level wise)
    2. Get total available slots(small,compact,large) level wise
    3. findParkingSpot(Vehicle)
    4. IsParkingLot full? IsLevelFull?
    
--------------->
Classes:
    1. Model a given spot ? (Spot => level,type=small,compact,large)
    2. Model a level ? (ParkingLevel => floor,num# of spots type wise)
    3. Model a vehicle
    4. Initial ParkingLot factory => (config params => num of levels,each level can have diff type of spots) =>extensible/modifiable
    5. ParkingLot allocation service



*/
public interface ParkingLot {
   
    public int getNumberOfLevels();
    //returns total available spots in whole parking lot
    public int getTotalAvailableSpots();
    //returns total occupied spots in whole parking lot
    public int getTotalOccupiedSpots();
    
    //returns total available spots for given vehicle/spot size
    public int getTotalAvailableSpots(VehicleSize v);
    
    //returns total occupied spots for given vehicle/spot size
    public int getTotalOccupiedSpots(VehicleSize v);
    
    //returns total available spots for given parking level
    public int getTotalAvailableSpots(ParkingLevel level);
    
    //returns total occupied spots for given parking level
    public int getTotalOccupiedSpots(ParkingLevel level);
    
    //get total Spot/Vehicle size types supported by parking lot
    public List<VehicleSize> getSpotTypes();
    
    //for a given input vehicle, return the available spot
    public Spot findParkingSpot(Vehicle vehicle);
    
    //for a given inut vehicle , allocate the found parking spot
    public boolean allocateParkingSpot(Vehicle vehicle,Spot spot);
    
    //for an exiting vehicle, free up the parking spot occupied
    public boolean freeParkingSpot(Vehicle vehicle);
           
}
/*
    Level 1 =           1 2 3 4 5 6 7 8 9 10 ................. 21
            Row 1 =>    S S S S S S S S S S S S S S S S S S S S S
            Row 2 =>    C   C   C   C   C   C   C   C   C   C   C
            Row 3 =>    L       L       L       L       L       L
                
    Level 2 =           1 2 3 4 5 6 7 8 9 10 ................. 21
            Row 1 =>    S S S S S S S S S S S S S S S S S S S S S
            Row 2 =>    C   C   C   C   C   C   C   C   C   C   C
            Row 3 =>    L       L       L       L       L       L
    .....
*/