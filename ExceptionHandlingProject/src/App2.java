import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App2 {
    public static void main(String[] args) {
        
        int x=10;
        System.out.println("x"+x);

        int y=2;
        System.out.println("y"+y);
        
        int z= x/y;//ignoring the ArithmeticExcepition
        System.out.println("z"+z);
        

        int ary[]={10,20,30};
        System.out.println("ary : "+ary[2]);

        try {
            System.out.println("trying to open the file...");
            FileInputStream fin = new FileInputStream("/Users/apple/prince.txt");
            System.out.println("file is opened....");
        } catch (FileNotFoundException e) {
           System.out.println("some problem while opening the file : "+e);
        }

        String company="KPIT Technologies";
        System.out.println("company : "+company);
        System.out.println("company : "+company.toUpperCase());
        System.out.println("company : "+company.substring(5, 16));
    }
}
