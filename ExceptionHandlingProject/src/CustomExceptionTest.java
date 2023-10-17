public class CustomExceptionTest {
    public static void main(String[] args) {
        System.out.println("begin main");
      
        try {
            Car car = new Car();
            car.longDrive();
        }
        catch(TyrePuncturedException ex1) {
            System.out.println("Some tyre problem during the drive : "+ex1); // + sign will print the actual exception classname and the error msg
        }
        catch(FuelRanOutException ex2){
            System.out.println("Some fuel problem during the drive : "+ex2); // + sign will print the actual exception classname and the error msg
        }
        catch(BrakesFailedException ex3) {
            System.out.println("Some brake problem during the drive : "+ex3); // + sign will print the actual exception classname and the error msg
        } catch (CarKeyNotFoundException ex4) {
            System.out.println("At the home :  "+ex4); // + sign will print the actual exception classname and the error msg

        }

        System.out.println("end of main");
    }
}






















// class SedanCar 
// {
//     void longDrive() {
       
//         for (int i = 1; i <= 50; i++) {

//             double val = Math.random()%10; // 0 to 1

//             if(val>0.99) {
//                 throw new RuntimeException("Oh!!! the tyre is punctured....can't go now..");
//             }
            
//             if(val>0.50 && val <0.51) {
//                 throw new RuntimeException("OMG, the brakes failed...can't go now..");
//             }

//             if(val>0.10 && val<0.11) {
//                 throw new RuntimeException("Oh!!! fuel ran out....can't go now..");
//             }

//             System.out.println("driving my car "+i);
//         }
//     }
   
// }
