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
public class ParkingTicket {
    private int ticket;
    /*
    start time 
    end time
    vehicle type
    charge
    license plate
    penalty
    overtime
    */
    public ParkingTicket(int i){
        this.ticket = i;
    }
    public ParkingTicket(Vehicle v){
        this.ticket = (int)((Math.random()*100000000)%1000000000);
        //this.start_time......etc//
    }
    public ParkingTicket(){
        this.ticket = (int)((Math.random()*100000000)%1000000000);
    }
    public int getTicket(){
        return this.ticket;
    }
    
}
