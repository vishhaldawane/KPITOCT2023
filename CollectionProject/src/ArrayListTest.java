import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        System.out.println("CREATING CONTAINER....");
        ArrayList numberList = new ArrayList(); //container is ready
        System.out.println("CONTAINER CREATED...");

        System.out.println("ADDING CONTENT....");
        numberList.add(10); //content is added
        numberList.add(20);
        numberList.add(30);
        numberList.add(10);
        numberList.add(20);
        numberList.add(40);
        numberList.add(50);
        System.out.println("CONTENT IS ADDED");

        //lets access the content of the container - means iterate over it
        System.out.println("ACCESSING ITERATOR....");
            Iterator numberIterator = numberList.iterator();
        System.out.println("GOT THE ITERATOR....");

        System.out.println("ITERATING through the COLLECTION....");
       
        while(numberIterator.hasNext()) {
            Integer intValue = (Integer) numberIterator.next();
            System.out.println("value : "+intValue);
        }
        
        System.out.println("DONE....");
        
        
    }
}

