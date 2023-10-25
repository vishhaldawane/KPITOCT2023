package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOperation {
    public static void main(String[] args) {
    try {    
        EntityManagerFactory factory =    Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
           
        EntityTransaction trans = manager.getTransaction();
        trans.begin();
            //below object is retrieved by JPA using find function
            //, hence it is managed object, any changes made to this
            //object is senstitive to JPA 

            System.out.println("Enter flight number to modify ");
            Scanner scanner1 = new Scanner(System.in);
            int flightNumberToSearch = scanner1.nextInt();


            Flight flight1 = manager.find(Flight.class, flightNumberToSearch);

            if(flight1 == null ) {
                FlightNotFoundException flightNotFoundEx = new FlightNotFoundException("This flight id does not exists !!! "+flightNumberToSearch);
                throw flightNotFoundEx;
            }
            System.out.println("Current Flight No   : "+flight1.getFligthNumber());
            System.out.println("Current Flight Src  : "+flight1.getFlightSource());
            System.out.println("Current Flight Dest : "+flight1.getFlightDestination());
            System.out.println("Current Flight Tke  : "+flight1.getTicketCost());
            System.out.println("Enter NEW details below");
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            Scanner scanner4 = new Scanner(System.in);
            
            System.out.println("Enter new source ");
            String newSrc= scanner2.nextLine();
            
            System.out.println("Enter new destination ");
            String newDest= scanner3.nextLine();
            
            System.out.println("Enter new ticket cost ");
            double newTicketCost= scanner4.nextDouble();

            System.out.println("Setting newSrc,newDest and newTicketCost to the flight object.....");
            flight1.setFlightSource(newSrc);
            flight1.setFlightDestination(newDest);
            flight1.setTicketCost(newTicketCost);

            manager.merge(flight1);
            System.out.println("Object is modified...");
            
            trans.commit();
            System.out.println("Record updated...");

            manager.close();
            System.out.println("Entity manager closed..");
        }
        catch(FlightNotFoundException e) {
            System.out.println("Error : "+e);
        }
    }
}

