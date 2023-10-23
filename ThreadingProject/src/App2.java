public class App2 {
    public static void main(String[] args) {

        Pen pen = new Pen();
        FountainPen fountainPen = new FountainPen();
        SketchPen sketchPen = new SketchPen();

        pen.startWriting();
        System.out.println("-------");
        fountainPen.startWriting();
        System.out.println("-------");

        sketchPen.startWriting();
        System.out.println("-------");

        Chalk chalk = new Chalk();
        Pen pen2 = new Pen(chalk);
        pen2.startWriting();

        System.out.println("------");

        Pencil pencil = new Pencil();
        Pen pen3 = new Pen(pencil);
        pen3.startWriting();

       // Writeable writeable = null;

       // writeable = new Chalk();

       // writeable.write();

       // FountainPen fountainPen = new FountainPen();
       // myPen.write(); // run(); never call run(), call it via start

        //fountainPen.startWriting();

       // Chalk chalk = new Chalk(); //Chalk is not the Pen
       // chalk.startWriting();
       // chalk.write();
    }
}

interface Writeable { //Runnable | run()
    void write();
}

class Pen implements Writeable { // Thread with run()

    Writeable writeable = null;

    Pen() {
        writeable = this; //for FountainPen, SketchPen, not for Chalk
    }
    Pen(Writeable w ) {
        writeable = w; //for Chalk, FountainPen, SketchPen
    }

    public void write() {
        System.out.println("Pen is writing...");
    }

    public void startWriting() { //EXCLUSIVE METHOD OF the Pen
        takeWritingSupport();
        takeWritingTarget();
        checkStatus();
        writeable.write();
    }
    private void takeWritingTarget() { // | paper | hand | sand | blackboard
        System.out.println("taking the writing target........");
    }
    private void checkStatus() {
        System.out.println("Checking the status...");
    }
    private void takeWritingSupport() {
        System.out.println("Taking the writing support...");
    }
}
class FountainPen extends Pen { // MessageThread
 public void write() { //not mandatory
        System.out.println("FountainPen is writing...");
    }
}


class Stone
{

}
class Marble extends Stone
{

}
class Chalk extends Stone implements Writeable
{
    public void write() { //mandatory
        System.out.println("Chalk is writing on the blackboard...");
    }
}
class Graphite extends Stone {

}

class Pencil extends Graphite implements Writeable
{
    
    public void write() {
        System.out.println("Pencil is writing....on the paper...");
    }
}

class SketchPen extends Pen
{
    public void write() { //not mandatory to override
        System.out.println("SketchPen is writing...on drawing paper");
    }
}
/*
 * 
 *     Stone(c)            Writeable(i)
 * extends|                 | write();
 *  -----------  ------------------
 *  |         |  | implements    |
 * Marble    Chalk              Pen
 *             write();          | startWriting() -> 3 funs ->write()
 *                     SketchPen   FountainPen
 */