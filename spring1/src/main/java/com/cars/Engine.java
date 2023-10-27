package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    
    String engineModel;
    Piston piston;

    @Autowired
    Engine(@Value("8 Cylinder") String engineModel, Piston piston ) {
        this.piston = piston;
        System.out.println("Engine() ctor..."+engineModel+ "Piston : "+piston.typeOfPiston);
        this.engineModel = engineModel;
    }
}
