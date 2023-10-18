public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Environment env = new SleepingEnvironment(26,1);
        env.tuneLevelOfSilence(10);
        env.tuneTemperature(26);

        SleepQuality quality = (SleepQuality) person.sleep(env);

        System.out.println("Level : "+quality.level);
        System.out.println("State : "+quality.state);
        
        Reason reason = new Reason("wife is sleeping in the train on your shoulder");
        
        System.out.println("reason is : "+reason);

        Reaction reaction = person.react(reason);

        System.out.println("reaction : "+reaction);

    }
}

interface Learning {
    Quality learn(Environment env) ;

}
interface Eating {
    Quality eat(Environment env);
}
class FoodEnvironment implements Environment {

}

class FoodQuality implements Quality {

}

class LearningQuality implements Quality {

}
class LearningEnvironment implements Environment {

}

interface Sleeping {
    Quality sleep(Environment e);
}







class Reaction { 
    int level;
    String type;

    public Reaction(int level, String type) {
        this.level = level;
        this.type = type;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Reaction [level=" + level + ", type=" + type + "]";
    }
    
    
    
}
class Reason { 
    String cause;

    public Reason(String cause) {
        this.cause = cause;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "Reason [cause=" + cause + "]";
    }
    
   
    
}

interface Reactive { //Iterable
    Reaction react(Reason x); // by default is abstract and public 
 // Iterator iterator();
}
interface Quality {
    void levelOfFreshness(float level);
    void stateOfTheMid(String state);
}

interface Environment { 
    void tuneTemperature(float temperature);
    void tuneLevelOfSilence(float soundLevel);
}

class SleepQuality implements Quality { 
    float level;
    String state;

    
    public SleepQuality(float level, String state) {
        this.level = level;
        this.state = state;
    }
    public void levelOfFreshness(float level) {
        this.level = level;
    }
    public void stateOfTheMid(String state) {
        this.state= state;
    }
}
class SleepingEnvironment implements Environment { 
    float temperature;
    float soundLevel;

    
    public SleepingEnvironment(float temperature, float soundLevel) {
        this.temperature = temperature;
        this.soundLevel = soundLevel;
    }
    public void tuneTemperature(float temperature) { 
        this.temperature  = temperature;
    }
    public void tuneLevelOfSilence(float soundLevel) { 
        this.soundLevel=soundLevel;
    }
}



class Person implements Reactive, Sleeping
{
    

    public Quality sleep(Environment env) {
        Quality quality = null;
        SleepingEnvironment sleepEnv = (SleepingEnvironment) env;
        if(sleepEnv.temperature==26) {
            if(sleepEnv.soundLevel==1) {
                quality = new SleepQuality(10.0f,"Fresh");                
            }
            else if(sleepEnv.soundLevel==10) {
                quality = new SleepQuality(2.0f,"Drowsy");                
            }
        }
        return quality;
    }


    //      class         class
    public Reaction react(Reason y) {
        System.out.println("Person is reacting....");
        
        Reaction reaction = null;

        if(y.getCause().contains("wife")) {
            if(y.getCause().contains("sleep")) {
                String status = "Allow";
                int level = 10; // top level 
                reaction = new Reaction(level,status);
            }
        }
        else if(y.getCause().contains("stranger")) {
           
            if(y.getCause().contains("sleep")) {

                if(y.getCause().contains("last station")) {
                    String status = "Hey Wake Up";
                    int level = 10; // top level 
                    reaction = new Reaction(level,status);
                }
                else {
                    String status = "Deny";
                    int level = 1; // top level 
                    reaction = new Reaction(level,status);
                }
            }
        }
        
        return reaction;
    }
}
// select any one of the following based on the above code scenario
/*
 * 1. cannot reduce the visibility of react
 * 2. code would run
 * 3. runtime exception
 * 4. none of the above
 */

