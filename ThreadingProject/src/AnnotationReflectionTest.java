import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationReflectionTest
{
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        


        Class theMirror = gf.getClass();

        Constructor ctors [] = theMirror.getConstructors();
        for (Constructor constructor : ctors) {
            System.out.println("Constructor : "+constructor.getName() + " with "+constructor.getParameterCount()+" arguments");
            Parameter paras[] = constructor.getParameters();
            for (Parameter para : paras) {
                System.out.println("Parameter is "+para.getName()+" of "+para.getType());
            }
            System.out.println("-----");
        }
//1940 1970 2001
        System.out.println("============");
        Method methods[] = theMirror.getMethods();
        for (Method theMethod : methods) {
            System.out.println("Method:"+theMethod.getName());

            Annotation methodAnnos [] = theMethod.getAnnotations();
            for (Annotation theAnnotation : methodAnnos) {
                //System.out.println("Annotation is : "+theAnnotation);
                if(theAnnotation instanceof DeviceUsed) {
                    DeviceUsed deviceUsed = (DeviceUsed) theAnnotation;
                    System.out.println("Device Name : "+deviceUsed.deviceName());
                    if(deviceUsed.deviceName().equalsIgnoreCase("plough")) {
                        System.out.println("Plough is used in the farm");
                    }
                    else {
                        System.out.println("Something unusual used in the farm....");
                    }
                }
                System.out.println("--------------------");
            }

        }
        System.out.println("-------------");

        Annotation annos [] = theMirror.getAnnotations();
        for (Annotation annotation : annos) {
            System.out.println("The annotation is : "+annotation);
            DevelopedBy developedBy = (DevelopedBy) annotation;
            if(developedBy.name().equals("Sakshi M")) {
                System.out.println("Class is being processed...");
            }
            else {
                System.out.println("Class is not written by Sakshi M, hence not being processed...");
            }
            
        }

    //Reflection - it acts as a mechanism to introspect the object | crawler | spider
    
    //every instance of an "Object class"
    //got a method called as "getClass()"
    //that returns an instance of "class Class"

    }
}
//Annotation

@DevelopedBy(name="Vishhal") 
class GrandFather {  //developed by the developer Sakshi Mohite

    int age;

    //@...
    public GrandFather(int i, int j) {
        System.out.println("GrandFather Ctor with "+i +" and "+j);
    }

    public GrandFather() {
        System.out.println("GrandFather Ctor without args");
    }

    public GrandFather(int i) {
        System.out.println("GrandFather Ctor with "+i );
    }

    @DeviceUsed(deviceName = "plough")
    public void farming() {
        System.out.println("GrandFather is farming...using the plough");
    }
    public void wakeUp() {
        System.out.println("GrandFather is waking up at 4.30am");
    }
}
/* 
class Father extends GrandFather {

  @Override
      @DeviceUsed(deviceName = "tractor")

  void farming() {
    System.out.println("father is farming using the tractor...");
  }
    void wakeUp() {
        System.out.println("Father is waking up at 6.30am");
    }
   
   
   
}

class Child extends Father  {

    @Override
        @DeviceUsed(deviceName = "robots")

    void farming() {
        System.out.println("Child is farmiiing in using the robotic tractor...");
    }

    void wakeUp() {
        System.out.println("Child is waking up  at 7.30am");
    }

}

SavingsAccount sav = new SavingsAccount(101,"Jack");

DriverManager.regsg...
DriverManager.getConn

conn.prepareStatem..... inset into sav values ??
pst.setInt(1,101);
pst.setString(2,"jack");
pst.excuteUda...


SavingsAccount savObj1 = new SavingsAccount(101,"Jack");
EntityManager em = Entit......
em.save(savObj1);
*/


/* 
@Table("name="sav") //extra info
class SavingsAccount
{
    @Column(name="accno") //extra info
    int accountNumber;




}

*/