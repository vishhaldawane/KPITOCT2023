import java.util.*;
public class ArrayListTest1
{
        public static void main(String args[])
        {   
                //ArrayList logList = new ArrayList();
                //LinkedList logList = new LinkedList();
                TreeSet logList = new TreeSet();
       //         HashSet logList = new HashSet();
                
		LogMessage log1 = new LogMessage("Missed Call",10);
		LogMessage log2 = new LogMessage("Dialled Call",20);
		LogMessage log3 = new LogMessage("Recieved Call",5);
		LogMessage log4 = new LogMessage("Missed Call",30);
		LogMessage log5 = new LogMessage("Blank Call",9);

		logList.add(log1);
		logList.add(log2);
		logList.add(log3);
		logList.add(log4);
		logList.add(log5);
	
		Iterator logIter = logList.iterator();

                while(logIter.hasNext()) {
                        LogMessage log = (LogMessage)  logIter.next();
                	log.printLogMessage();
		}   
        }   
}
class LogMessage implements Comparable<LogMessage>
{
	String logType;
	int logLevel;

	public int compareTo(LogMessage x) {
		System.out.println("comparing...."+logLevel+ " with "+x.logLevel );
		return Integer.compare(logLevel, x.logLevel);
	}

	LogMessage(String s, int l) {
		logType = s;
		logLevel = l;
	}
	public void printLogMessage() {
		System.out.println(logType + " and " + logLevel);
	}

}
