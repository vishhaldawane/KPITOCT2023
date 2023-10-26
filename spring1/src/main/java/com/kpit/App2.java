package com.kpit;

public class App2 {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.getCar("Maruti Suzuki","Four Stroke", "8 Cylidners", "Baleno");
        System.out.println("----------");
        car1.drive();

        System.out.println("--------------------------");

        Car car2 = factory.getCar("BMW","Eight Stroke", "16 Cylidners", "X5");
        System.out.println("----------");
        car2.drive();

         System.out.println("--------------------------");

        Car car3 = factory.getCar("KIA","12 Stroke", "24 Cylidners", "Carnival");
        System.out.println("----------");
        car3.drive();


    }
}
class CarFactory
{

    Car getCar(String cc, String x, String y, String z) {
        Piston thePiston = new Piston(x);
        Engine theEngine = new Engine(y,thePiston);
        Car theCar = new Car(cc,z,theEngine);
        return theCar;
    }
}
