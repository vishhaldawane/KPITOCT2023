package com.kpit;

public class App2 {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.getCar("Four Stroke", "8 Cylidners", "Skoda");
        System.out.println("----------");
        car1.drive();

        System.out.println("--------------------------");

        Car car2 = factory.getCar("Eight Stroke", "16 Cylidners", "Merc");
        System.out.println("----------");
        car2.drive();

         System.out.println("--------------------------");

        Car car3 = factory.getCar("12 Stroke", "24 Cylidners", "Tesla");
        System.out.println("----------");
        car3.drive();


    }
}
class CarFactory
{

    Car getCar(String x, String y, String z) {
        Piston thePiston = new Piston(x);
        Engine theEngine = new Engine(y,thePiston);
        Car theCar = new Car(z,theEngine);
        return theCar;
    }
}
