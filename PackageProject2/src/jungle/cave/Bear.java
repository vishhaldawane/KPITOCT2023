package jungle.cave;

public class Bear {
    Tiger tiger = new Tiger();
    Lion lion = new Lion();

    void fetchHoney() {
        lion.age=300;
    }

    public void jump() {
        System.out.println("frog is jumping...");
        Tiger tiger = new Tiger();
        tiger.jump();
        System.out.println("defaultA "+tiger.defaultA);
        System.out.println("privateB "+tiger.privateB);
        System.out.println("protectedC "+tiger.protectedC);
        System.out.println("publicD "+tiger.publicD);
        
    }

    void bigJump() {
        System.out.println("defaultA "+defaultA);
        System.out.println("privateB "+privateB);
        System.out.println("protectedC "+protectedC);
        System.out.println("publicD "+publicD);
        
    }
}
