package com.kpit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAllOperation {
    public static void main(String[] args) {
        
        EntityManagerFactory factory =    Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
           
        /*
         * 
         * while(result.next) {
         * int flightNumber = result.getInt(1);
         * }
         */
        //JPQL(pojo name in the query) and in SQL(table name is select query)
        TypedQuery<Flight> typedQuery = manager.createQuery("from Flight", Flight.class);

        List<Flight> flightList= typedQuery.getResultList();

        for (Flight flight : flightList) {
            System.out.println("Flight No   : "+flight.getFligthNumber());
            System.out.println("Flight Src  : "+flight.getFlightSource());
            System.out.println("Flight Dest : "+flight.getFlightDestination());
            System.out.println("Flight Tke  : "+flight.getTicketCost());
            System.out.println("------------------");
        }
            
    }
}
