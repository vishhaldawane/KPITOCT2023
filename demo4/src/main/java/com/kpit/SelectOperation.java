package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectOperation {
    public static void main(String[] args) {
        
        EntityManagerFactory factory =    Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
           
        System.out.println("Enter flight number to search ");
            Scanner scanner1 = new Scanner(System.in);
            int flightNumberToSearch = scanner1.nextInt();

            Flight flight1 = manager.find(Flight.class, flightNumberToSearch);

            if(flight1 == null ) {
                FlightNotFoundException flightNotFoundEx = new FlightNotFoundException("This flight id does not exists !!! "+flightNumberToSearch);
                throw flightNotFoundEx;
            }
            System.out.println("Flight No   : "+flight1.getFligthNumber());
            System.out.println("Flight Src  : "+flight1.getFlightSource());
            System.out.println("Flight Dest : "+flight1.getFlightDestination());
            System.out.println("Flight Tke  : "+flight1.getTicketCost());
        
            
    }
}
