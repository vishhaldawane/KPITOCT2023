package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        System.out.println("=> Context is created.."+context);

        System.out.println("1 asking context to get a bean via getBean() ");
        Flower flower1 =  (Rose) context.getBean("myRose");
        flower1.flowering();
        System.out.println("-------");

        System.out.println("1 asking context to get a bean via getBean() ");
        Flower flower2 =  (Lotus) context.getBean("myLotus");
        flower2.flowering();
        System.out.println("-------");

        System.out.println("1 asking context to get a bean via getBean() ");
        Flower flower3 =  (Lily) context.getBean("myLily");
        flower3.flowering();
        System.out.println("-------");

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