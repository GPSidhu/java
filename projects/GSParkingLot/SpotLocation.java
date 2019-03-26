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
public class SpotLocation {
    private int row;
    private int spotNumber;    
    private boolean isAvailable;
    private Spot spot;
    
    public SpotLocation(int r,int sn){
        this.row = r;
        this.spotNumber = sn;
        this.isAvailable = true;
    }
    
    public int getSpotNumber(){
        return this.spotNumber;
    }
    
    public boolean isAvailable(){
        return isAvailable;
    }
    
    public void setOccupied(Spot spot){
        this.spot = spot;
        this.isAvailable = false;                        
    }
    
    public void setAvailable(){
        this.spot = null;
        this.isAvailable = true;
    }
    
    public int getRow(){
        return this.row;
    }        
}
