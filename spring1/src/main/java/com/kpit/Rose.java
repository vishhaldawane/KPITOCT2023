package com.kpit;

public class Rose implements Flower {
    String color;

    public Rose(String color) {
        this.color=color;
        System.out.println(color+" color Rose(String) is created..."+this);
    }

    public Rose() {
        System.out.println(color+" color Rose() is created..."+this);
    }
    public void flowering() {
        System.out.println(color+" color rose is flowering...."+this);
    }
}
