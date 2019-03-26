/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guri.design.GSParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author gfsingh
 */
public class ParkingLevel {
    private String level;
    private Map<VehicleSize,SpotType> spotTypes;
    
    
    public ParkingLevel(){
        this.level = "1";
        this.spotTypes = new HashMap<>();        
    }
    public ParkingLevel(String lvl){
        this.level = lvl;
        this.spotTypes = new HashMap<>();        
    }
    
    public void configureSpots(Configuration conf){
        List<SpotType> list = conf.getSpotTypes();
        if(list != null){
            for(SpotType sp : list){
                SpotType newSpotType = SpotTypeFactory.getInstance(sp);
                if(newSpotType != null){
                    newSpotType.setParkingLevel(this);
                    this.spotTypes.put(sp.getSize(),newSpotType );
                }
            }            
        }      
    }
    public Map<VehicleSize,SpotType> getSpotTypeMap(){
        return this.spotTypes;
    }
    
    public String getLevel(){
        return this.level;
    }
    
    public void updateCounter(VehicleSize size){
        if(this.spotTypes.containsKey(size)){
            int newAvlCount = this.spotTypes.get(size).getAvailableCount()-1;
            this.spotTypes.get(size).setAvailableCount(newAvlCount);
            ;
        }                
    }
    public int getAvailableSpots(VehicleSize size){
        if(this.spotTypes.containsKey(size)){
            return this.spotTypes.get(size).getAvailableCount();
        }
        return -1;
    }
    private String getSpotsStats(){
       StringBuilder  str= new StringBuilder();
       str.append("\n-------------- All Spots --------------");
        for(Map.Entry<VehicleSize,SpotType> e : spotTypes.entrySet()){
            str.append("\n -> "+e.getValue().toString());
            //str.append("\n\t\t Available Count : "+e.getValue().getTotalCount());
            //str.append("\n\t\t Available Count : "+e.getValue().getAvailableCount());            
        }
        str.append("\n----------------------------------------");
        
        return str.toString();
    }
    public String toString(){
        String str = "\nLevel : "+this.level+getSpotsStats();        
        return str;        
    }
    
}
/*
    private List<Spot> smallSpots;
    private List<Spot> compactSpots;
    private List<Spot> largeSpots;
    
    private int totalSmallSpots;
    private int totalCompactSpots;
    private int totalLargeSpots;
    
    private int availableSmallSpots;
    private int availableCompactSpots;
    private int availableLargeSpots;
*/

/*
        this.availableSmallSpots = conf.getSmallSpots();
        this.availableCompactSpots = conf.getCompactSpots();
        this.availableLargeSpots = conf.getLargeSpots();
        
        this.totalSmallSpots = conf.getSmallSpots();
        this.totalCompactSpots = conf.getCompactSpots();
        this.totalLargeSpots = conf.getLargeSpots();
        
        for(int i=0;i<this.totalSmallSpots;i++){
            this.smallSpots.add(new Spot(VehicleSize.Small,this,1,i+1));
        }
        
        for(int i=0;i<this.totalCompactSpots;i++){
            this.compactSpots.add(new Spot(VehicleSize.Compact,this,1,i+1));
        }
        for(int i=0;i<this.totalLargeSpots;i++){
            this.largeSpots.add(new Spot(VehicleSize.Large,this,1,i+1));
        }            
        */