public class App {
    public static void main(String[] args) throws Exception {
        Magician magician = new Magician();
        magician.doMagic();
        System.out.println("---------");

        CardMagician cardMagician = new CardMagician();
        cardMagician.doMagic();
        cardMagician.flip();
        cardMagician.rotate();
        cardMagician.smile();

        System.out.println("-------------");
        HatMagician hatMagician = new HatMagician();
        hatMagician.doMagic();
        hatMagician.rotate();
        hatMagician.flip();
        hatMagician.smile();
    }
}
class Magician implements Smiling
{
    void doMagic() { //1.     exclusive function
        System.out.println("Magician is doing magic");
    }
    public void smile() { //4
        System.out.println("Magician is smiling...");
    }

    void eat()  {
        System.out.println("Eating the food...."); //1. and for child it is 2 
    }
}

//SELF (SUBJECT)            else = OBJECT
         
// The sea is vast, my boat is frail
// Thou ART is with me, and everything is well

// there is no career in any company
// it is in your potential

// Lakshmi = earning            Saraswati = lEarning

interface Rotating {
    void rotate(); //abstract function | no body 
}
interface Flipping {
    void flip(); //abstract function | no body
}
interface Smiling {
    void smile();
}
class CardMagician extends Magician implements Flipping, Rotating
{
    void doMagic() { //3. overriding
        System.out.println("CardMagician is doing card magic");
    }

    public void flip() { //contract from Flipping
        System.out.println("Card magician is flipping the cards...");
    }
    public void rotate() { //contract from Rotating
        System.out.println("Card magician is rotating the cards...");
    }
    public void smile() {
        System.out.println("Card Magician is smiling...");
    }
    public void drawCard() {//1
        System.out.println("drawing a card from the bunch");
    }

}

class HatMagician extends Magician implements Rotating, Flipping
{
    void doMagic() { //overriding | not mandatory
        System.out.println("HatMagician is doing hat magic");
    }

   public void flip() { //contract from Flipping
        System.out.println("Hat magician is flipping the hats...");
    }
    public void rotate() { //contract from Rotating
        System.out.println("Hat magician is rotating the hats...");
    }
     public void smile() { //overriding | not mandatory
        System.out.println("Hat Magician is smiling...");
    }
    public void hideEggUnderHat() {
        System.out.println("Hat magician is hiding egg under a hat");
    }
}