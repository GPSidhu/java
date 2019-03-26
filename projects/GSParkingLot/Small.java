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
public class Small extends SpotType{
    public Small(SpotType sType){
        super(sType);        
    }
    public Small(int count,int rows,int cols,int startingRow){
        super(count,rows,cols,startingRow);        
        this.setSize(VehicleSize.Small);
        this.setSpotType("Small");
    }
}
