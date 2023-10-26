package com.kpit;

public class Lily implements Flower {
    String color;

    public Lily(String color) {
        this.color=color;
        System.out.println(color+" color Lily(String) is created..."+this);
    }

    public Lily() {
        System.out.println(color+" color Lily() is created..."+this);
    }
    public void flowering() {
        System.out.println(color+" color Lily is flowering...."+this);
    }
}
