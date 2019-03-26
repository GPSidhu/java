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
public class Compact extends SpotType{
    
    public Compact(SpotType sType){
        super(sType);        
    }
    public Compact(int count,int rows,int cols,int startingRow){
        super(count,rows,cols,startingRow);
        this.setSize(VehicleSize.Compact);
        this.setSpotType("Compact"); 
    }
}
