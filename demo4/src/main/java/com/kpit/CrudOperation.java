package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudOperation {
    public static void main(String[] args) {
        
        EntityManagerFactory factory =    Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction =   manager.getTransaction();
        transaction.begin();
           
        Flight flight1 = new Flight(102, "Delhi", "Dehradun", 5200);
        Flight flight2 = new Flight(103, "Mumbai", "Delhi", 5300);
        Flight flight3 = new Flight(104, "Dehradun", "Mumbai", 5500);
        Flight flight4 = new Flight(105, "Mumbai", "Paris", 65000);
        
            manager.persist(flight1);
            manager.persist(flight2);
            manager.persist(flight3);
            manager.persist(flight4);
            
        transaction.commit();
    }
}
