public class FinalTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.2f);
        Circle circle2 = new Circle(20.2f);
        Circle circle3 = new Circle(30.2f);


        circle1.calculateArea();
        circle2.calculateArea();
        circle3.calculateArea();
        System.out.println("---------");

       // circle1.PI=3.18f;

        circle1.calculateArea();
        circle2.calculateArea();
        circle3.calculateArea();
        System.out.println("---------");

        Car car1 = new Car("Maruti Swift", "123123123", "MH-12-0965");
        Car car2 = new Car("Merc", "623123123", "MH-01-0365");
        Car car3 = new Car("BMW", "723123123", "MH-02-0165");
        
        System.out.println("car1 "+car1);
        System.out.println("car1 "+car2);
        System.out.println("car1 "+car3);
        
    }
}

abstract class GeometricalShape {
   abstract void calculateArea();
}
class Car {
    final String modelName;
    final String serialNumber;
    private final String numberPlate;
    
    public Car(String modelName, String serialNumber, String numberPlate) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.numberPlate = numberPlate;
    }

    @Override
    public String toString() {
        return "Car [modelName=" + modelName + ", serialNumber=" + serialNumber + ", numberPlate=" + numberPlate + "]";
    }

    
}

class Circle extends GeometricalShape
{
    float radius;
    private static final float PI = 3.14f; //CONSTANT


    public Circle(float radius) {
        this.radius = radius;
    }
    void show() {
        System.out.println("radius : "+radius);
    }
    void calculateArea() {
       
        float areaOfCircle = radius * radius * PI;
        System.out.println("calculated area : "+areaOfCircle);
      
    }
}