package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * create table flight_tbl (
 *  number   number,
 *  
 * )
 * 
 */
@Entity
@Table(name="flight_tbl")
public class Flight {

    @Id
    @Column(name="flight_no")
    private int fligthNumber;

    @Column(name="source",length = 20)
    private String flightSource;

    @Column(name="dest",length = 20)
    private String flightDestination;

    @Column(name="tkt_cost")
    private double ticketCost;

    

    public Flight(int fligthNumber, String flightSource, String flightDestination, double ticketCost) {
        this.fligthNumber = fligthNumber;
        this.flightSource = flightSource;
        this.flightDestination = flightDestination;
        this.ticketCost = ticketCost;
    }


    public Flight() {
        System.out.println("Flight ctor...");
    }


    public int getFligthNumber() {
        return fligthNumber;
    }
    public void setFligthNumber(int fligthNumber) {
        this.fligthNumber = fligthNumber;
    }
    public String getFlightSource() {
        return flightSource;
    }
    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }
    public String getFlightDestination() {
        return flightDestination;
    }
    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }
    public double getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    
}
