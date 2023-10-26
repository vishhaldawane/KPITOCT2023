package com.kpit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Piston thePiston1 = new Piston("Six Stroke");
        Piston thePiston2 = new Piston("Eigth Stroke");

        Engine theEngine1 = new Engine("16 Cylinder",thePiston1);
        Engine theEngine2 = new Engine("18 Cylinder",thePiston2);
        
        System.out.println("----------------");
        Car car1 = new Car("BMW","X1",theEngine1);
        System.out.println("----------------");

        Car car2 = new Car("Maruti Suzuki","Baleno",theEngine2);
        System.out.println("----------------");

        car1.drive();
        System.out.println("----------------");

        car2.drive();

    }
}
class Piston 
{
    String type;
    Piston(String type) {
        this.type=type;
        System.out.println("Piston is created..."+type+" "+this);
    }
    void firePiston() {
        System.out.println(type+" piston is fired..."+this);
    }
}
class Engine 
{
    String engineModel;
    Piston piston;

    Engine(String em, Piston piston) {
        this.engineModel = em;
        this.piston=piston;
        System.out.println(engineModel+" model Engine created..."+this);
    }
    void ignite() {
        piston.firePiston();
        System.out.println(engineModel+" Engine is ignited...."+this);
    }
}
class Car
{
    String carModel;
    Engine engine;
    String carCompany;

    Car(String carCompany, String model, Engine engine) {
        this.carCompany = carCompany;
        this.carModel = model;
        this.engine = engine;
        System.out.println(carCompany+" company's "+carModel+" Car created..."+this);
    }
    void drive() {
        engine.ignite();
        System.out.println(carModel+" model car is driven.."+this);
    }
}