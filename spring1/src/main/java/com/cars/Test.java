package com.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mySpringCars.xml");
        System.out.println("ctx is ready..: "+ctx);
    }
}
