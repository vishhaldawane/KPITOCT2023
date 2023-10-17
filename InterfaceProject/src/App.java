public class App {
    public static void main(String[] args) throws Exception {
        Magician magician = new Magician();
        magician.doMagic();
        System.out.println("---------");

        CardMagician cardMagician = new CardMagician();
        cardMagician.doMagic();
        cardMagician.flipCard();
        cardMagician.smile();

        System.out.println("-------------");
        HatMagician hatMagician = new HatMagician();
        hatMagician.doMagic();
        hatMagician.rotateCap();
        hatMagician.smile();
    }
}
class Magician implements Smiling
{
    void doMagic() { // overridden function
        System.out.println("Magician is doing magic");
    }
    public void smile() {
        System.out.println("Magician is smiling...");
    }
}

//SELF (SUBJECT)            else = OBJECT
         
// The sea is vast, my boat is frail
// Thou ART is with me, and everything is well

// there is no career in any company
// it is in your potential

// Lakshmi = earning            Saraswati = lEarning

interface Rotating {
    void rotateCap(); //abstract function | no body 
}
interface Flipping {
    void flipCard(); //abstract function | no body
}
interface Smiling {
    void smile();
}
class CardMagician extends Magician implements Flipping
{
    void doMagic() { //overriding
        System.out.println("CardMagician is doing card magic");
    }

    public void flipCard() {
        System.out.println("Card magician is flipping the cards...");
    }
    public void smile() {
        System.out.println("Card Magician is smiling...");
    }

}

class HatMagician extends Magician implements Rotating
{
    void doMagic() { //overriding | not mandatory
        System.out.println("HatMagician is doing hat magic");
    }

    public void rotateCap() { //MANDATE
        System.out.println("Hat magician is rotating the caps...");
    }
     public void smile() { //overriding | not mandatory
        System.out.println("Hat Magician is smiling...");
    }
}