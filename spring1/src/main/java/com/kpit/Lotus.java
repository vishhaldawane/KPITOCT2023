package com.kpit;

public class Lotus implements Flower {
    String color;

    public Lotus(String color) {
        this.color=color;
        System.out.println(color+" color Lotus(String) is created..."+this);
    }

    public Lotus() {
        System.out.println(color+" color Lotus() is created..."+this);
    }
    public void flowering() {
        System.out.println(color+" color Lotus is flowering...."+this);
    }
}
