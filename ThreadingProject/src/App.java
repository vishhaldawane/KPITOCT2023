/*
 * HardWork => HardWork 
 * HardWork => SmartWork
 * SmartWork => HardWork
 * SmartWork => SmartWork
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Begin Main");
        
        Message messageThread1 = new Message("Ping"); //III.
        messageThread1.start(); //IV.
   
        Message messageThread2 = new Message("\tPong");
        messageThread2.start();

        Message messageThread3 = new Message("\t\tPang");
        messageThread3.start();

        Message messageThread4 = new Message("\t\t\tPung");
        messageThread4.start();
        
        System.out.println("End of Main");
        
    }
}
class Message extends  Thread //I. 
{
    private String str;
    Message(String x) { //initialize the str
        str = x;
    }
    public void run() { //II. overriding
        for (int i = 1; i < 60; i++) {
                    System.out.println(i+" "+str);
        }
    }
}
