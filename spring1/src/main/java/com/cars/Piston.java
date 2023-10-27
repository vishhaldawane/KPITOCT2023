package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Piston {
    
    String typeOfPiston;

    @Autowired
    Piston(@Value("4 Stroke") String typeOfPiston) {
        this.typeOfPiston = typeOfPiston;
        System.out.println("Piston() ctor..."+typeOfPiston);
    }
    void firePiston() {
        System.out.println("Piston of type "+typeOfPiston+" fired...");
    }
}
