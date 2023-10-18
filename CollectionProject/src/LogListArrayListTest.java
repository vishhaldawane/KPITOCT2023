import java.time.LocalDateTime;
import java.util.*;

public class LogListArrayListTest {

    public static void main(String[] args) {

        PhoneLog log1 = new PhoneLog("Recieved", LocalDateTime.of(2023,10,15, 20, 30), "Boss", 10.3f);
        PhoneLog log2 = new PhoneLog("Dialled", LocalDateTime.of(2023,10,16, 10, 30), "Wife", 30.3f);
        PhoneLog log3 = new PhoneLog("Recieved", LocalDateTime.of(2023,10,17, 19, 45), "Mother", 40.3f);
        PhoneLog log4 = new PhoneLog("Missed", LocalDateTime.of(2023,10,18, 8, 33), "Gf", 1.0f);
        PhoneLog log5 = new PhoneLog("Dialled", LocalDateTime.of(2023,10,18, 11, 35), "Vendor", 20.5f);
        System.out.println("content is ready...");

        ArrayList<PhoneLog> logList  = new ArrayList<PhoneLog>();
        System.out.println("container is ready...");

        System.out.println("Adding first log");
        logList.add(log1);

        System.out.println("adding second log...");
        logList.add(log2);

        System.out.println("adding third log...");
        logList.add(log3);

        System.out.println("adding fourth log...");
        logList.add(log4);

        System.out.println("adding fifth log...");
        logList.add(log5);
       
        Iterator<PhoneLog> logIterator = logList.iterator();
        System.out.println("Got the PhoneLog's Iterator");
        
        while(logIterator.hasNext()) {
            PhoneLog theLog = logIterator.next();
            System.out.println("Log is : "+theLog);
        }

    }
}

class PhoneLog //extends Object
{
    String logType;
    LocalDateTime localDateTime;
    String identity;
    float duration;
    public PhoneLog(String logType, LocalDateTime localDateTime, String identity, float duration) {
        this.logType = logType;
        this.localDateTime = localDateTime;
        this.identity = identity;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "PhoneLog [logType=" + logType + ", localDateTime=" + localDateTime + ", identity=" + identity
                + ", duration=" + duration + "]";
    }

    
}
