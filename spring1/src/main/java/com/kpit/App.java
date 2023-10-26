package com.kpit;

import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Piston thePiston1 = new Piston("Six Stroke");
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
        */

        Piston piston = new Piston(); // <-- <bean id class >
        piston.setType("FourStroke"); //<- <property name="piston">
        System.out.println("----------");
        Engine engine = new Engine();
        engine.setEngineModel("8 cyilnders"); //engineModel
        engine.setPiston(piston); //piston
        System.out.println("-----------");
        Car theCar = new Car();
        theCar.setCarCompany("Maruti Sujuki"); //carCompany
        theCar.setCarModel("Baleno"); //carModel
        theCar.setEngine(engine); //engine
    }
}
class Piston 
{
    String type;

   
    Piston() {
        System.out.println("Piston()...");
    }
    void firePiston() {
        System.out.println(type+" piston is fired..."+this);
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        System.out.println("setType(String)....");
        this.type = type;
    }
}
class Engine 
{
    String engineModel;
    Piston piston;

    

    Engine() {
        System.out.println("Engine()...");
    }
    public String getEngineModel() {
        return engineModel;
    }


    public void setEngineModel(String engineModel) {
        System.out.println("setEngineModel(String)....");
        this.engineModel = engineModel;
    }


    public Piston getPiston() {
        return piston;
    }


    public void setPiston(Piston piston) {
        System.out.println("setPiston(Piston)....");
        this.piston = piston;
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


    Car() {
        System.out.println("Car()...");
    }
   
    public String getCarModel() {
        return carModel;
    }


    public void setCarModel(String carModel) {
        System.out.println("setCarModel(String)....");
        this.carModel = carModel;
    }


    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        System.out.println("setEngine(Engine)...");
        this.engine = engine;
    }


    public String getCarCompany() {
        return carCompany;
    }


    public void setCarCompany(String carCompany) {
        System.out.println("setCarCompany(String).....");
        this.carCompany = carCompany;
    }


    void drive() {
        engine.ignite();
        System.out.println(carModel+" model car is driven.."+this);
    }
}