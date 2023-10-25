package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Creating Entity Manager Factory " );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        System.out.println("Created entity manager factory : ");

        System.out.println("Creating entity manager from the factory...");
        EntityManager em = emf.createEntityManager();
        System.out.println("Created entity manager : "+em);

        EntityTransaction trans = em.getTransaction();
        trans.begin();
            Account account = new Account();
            account.setAccountNumber(102);
            account.setAccountHolderName("Jane");
            account.setAccountBalance(60000);
            em.persist(account);
        trans.commit();

        em.close();
        System.out.println("Closed the entity manager...");
        
    }
}











//1(exception) 2(collection) 3(jdbc|bmp) 4(jpa|cmp) 5. springjpa
