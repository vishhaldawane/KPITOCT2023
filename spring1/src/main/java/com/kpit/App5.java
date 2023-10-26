package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringSetter.xml");
       
        System.out.println("=> Context is created.."+context);

       


        

    }
}













interface Running {
    void run();
}
class Racer implements Running {
    public void run() {
        System.out.println("Racer is running");
    }
}