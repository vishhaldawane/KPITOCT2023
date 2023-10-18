import java.util.*;

public class PhoneContactLinkedListTest {
    public static void main(String[] args) {
        
        PhoneContact contact1 =new PhoneContact("Rajeshree", "9845667789","rajeshree@gmail.com");
        PhoneContact contact2 =new PhoneContact("Rajesh", "8845667789","rajesh@gmail.com");
        PhoneContact contact3 =new PhoneContact("Raman", "7845667789","raman@gmail.com");
        PhoneContact contact4 =new PhoneContact("Ritesh", "3845667789","ritesh@gmail.com");
        PhoneContact contact5 =new PhoneContact("Reema", "4845667789","reema@gmail.com");
        
        LinkedList<PhoneContact> phoneBook  = new LinkedList<PhoneContact>();
        System.out.println("phonebook is ready...");

        System.out.println("Adding first contact");
        phoneBook.add(contact1);

        System.out.println("Adding second contact");
        phoneBook.add(contact2);
        
        System.out.println("Adding third contact");
        phoneBook.add(contact3);
        
        System.out.println("Adding fourth contact");
        phoneBook.add(contact4);
        
        System.out.println("Adding fifth contact");
        phoneBook.add(contact5);
        
        Iterator<PhoneContact> contactIterator = phoneBook.iterator();
        System.out.println("Got the PhoneContact's Iterator");
        
        while(contactIterator.hasNext()) {
            PhoneContact theContact = contactIterator.next();
            System.out.println("PhoneContact is : "+theContact);
        }

    }
}


class PhoneContact
{
    String name;
    String phoneNumber;
    String email;

    public PhoneContact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "PhoneContact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }

    
}