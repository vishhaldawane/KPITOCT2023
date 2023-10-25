package com.kpit;

import java.util.HashSet;
import java.util.Iterator;

public class KiteTest {
    public static void main(String[] args) {
        Kite kite1 = new Kite(101,"Red","Ekta",45.5f);
        Kite kite2 = new Kite(101,"Green","Ekta",45.5f);
        Kite kite3 = new Kite(101,"Green","Urvashi",45.5f);
        Kite kite4 = new Kite(101,"Green","Urvashi",145.5f);
        Kite kite5 = new Kite(101,"Green","Sakshi",45.5f);
        
        
        System.out.println("kite1 : "+kite1.hashCode());
        System.out.println("kite2 : "+kite2.hashCode());
        System.out.println("kite3 : "+kite3.hashCode());
        System.out.println("kite4 : "+kite4.hashCode());
        System.out.println("kite5 : "+kite5.hashCode());
    
        HashSet<Kite> kiteSet = new HashSet<Kite>();
        kiteSet.add(kite1);
        kiteSet.add(kite1);
        
        kiteSet.add(kite2);
        kiteSet.add(kite3);
        kiteSet.add(kite4);
        kiteSet.add(kite5);
        

        Iterator<Kite> kiteIterator = kiteSet.iterator();

        while(kiteIterator.hasNext()) {
            Kite theKite = kiteIterator.next();
            System.out.println("kite : "+theKite);
        }
        
    }
}

class Kite
{
    int kiteNumber;
    String color;
    String owner;
    float length;


    public Kite(int kiteNumber) {
        this.kiteNumber = kiteNumber;
    }

    

    public Kite(int kiteNumber, String color, String owner, float length) {
        this.kiteNumber = kiteNumber;
        this.color = color;
        this.owner = owner;
        this.length = length;
    }



   

    @Override
    public String toString() {
        return "Kite [kiteNumber=" + kiteNumber + ", color=" + color + ", owner=" + owner + ", length=" + length + "]";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + kiteNumber; //31 + 101 = 132
        result = prime * result + ((color == null) ? 0 : color.hashCode()); //31*132+5000=9092
        result = prime * result + ((owner == null) ? 0 : owner.hashCode()); //31*9092+7000=288852
        result = prime * result + Float.floatToIntBits(length); //288852*31+
        return result; //8954417
        
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Kite other = (Kite) obj;
        if (kiteNumber != other.kiteNumber)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
            return false;
        return true;
    }


    
   

   
    
}
