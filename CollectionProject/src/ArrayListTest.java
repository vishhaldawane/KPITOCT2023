import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListTest {
    public static void main(String[] args) {

        System.out.println("CREATING CONTAINER....");
        ArrayList numberList = new ArrayList(); //container is ready
       // LinkedList numberList = new LinkedList(); //container is ready
       // TreeSet numberList = new TreeSet(); //container is ready
       // HashSet numberList = new HashSet(); //container is ready
       
        System.out.println("CONTAINER CREATED...");

        System.out.println("ADDING CONTENT....");
        numberList.add(30); //content is added
        numberList.add(20);
        numberList.add(60);
        numberList.add(10);
        numberList.add(70);
        numberList.add(10);
        numberList.add(90);
        System.out.println("CONTENT IS ADDED");

        System.out.println("=======");
        for(int i=3;i<=5;i++) {
            System.out.println("value "+numberList.get(i));
        }
        System.out.println("=======");

        //lets access the content of the container - means iterate over it
        System.out.println("ACCESSING ITERATOR....");
            Iterator x = numberList.iterator();
        System.out.println("GOT THE ITERATOR....");

        System.out.println("ITERATING through the COLLECTION....");
       
        while(x.hasNext()) {
            Integer intValue = (Integer) x.next();
            System.out.println("value : "+intValue);
            
        }
        
        System.out.println("DONE....");
        
        
    }
}

