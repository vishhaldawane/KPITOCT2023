package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOperation {
    public static void main(String[] args) {
    try {    
        EntityManagerFactory factory =    Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
           
        EntityTransaction trans = manager.getTransaction();
        trans.begin();
            //below object is retrieved by JPA using find function
            //, hence it is managed object, any changes made to this
            //object is senstitive to JPA 

            System.out.println("Enter flight number to delete ");
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
            System.out.println("Are you sure to delete ? ");
            Scanner scanner2 = new Scanner(System.in);
            String ans = scanner2.nextLine();
            if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
            {
                manager.remove(flight1);            
                trans.commit();
                System.out.println("Record deleted...");
            }
            else {
                System.out.println("Record NOT deleted....");
            }
        
            manager.close();
            System.out.println("Entity manager closed..");
        }
        catch(FlightNotFoundException e) {
            System.out.println("Error : "+e);
        }
    }
}

