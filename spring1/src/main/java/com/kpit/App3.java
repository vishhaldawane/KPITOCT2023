package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        System.out.println("=> Context is created.."+context);

        System.out.println("1 asking context to get a bean via getBean() ");
        Rose rose =  (Rose) context.getBean("myRose");
        rose.flowering();
        System.out.println("-------");
        System.out.println("2 asking context to get a bean via getBean() ");
        Rose rose2 =  (Rose) context.getBean("myRose");
        rose2.flowering();

        System.out.println("-------");
        System.out.println("3 asking context to get a bean via getBean() ");
        Rose rose3 =  (Rose) context.getBean("myRose");
        rose3.flowering();
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