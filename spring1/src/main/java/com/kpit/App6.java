package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringAnno.xml");
       
        System.out.println("=> Context is created.."+context);

        Tiger tiger = (Tiger) context.getBean("myTiger");
        
        BengalTiger bengalTiger = ( BengalTiger) context.getBean("myBengalTiger");

        Bear bear = (Bear) context.getBean(Bear.class);
        bear.fetchHoney();


        
        // Student student = new Student();
        // student.rollno=1230;
        // System.out.println("college : "+Student.collegeName);
        // Class theMirror = Student.class;

    }
}



class Student
{
    int rollno;
    static int myclass;

    static String collegeName="Bharathi Vidyapitham";
}









interface Running {
    void run();
}
class Racer implements Running {
    public void run() {
        System.out.println("Racer is running");
    }
}