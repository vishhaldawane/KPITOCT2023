package com.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
class Car {

    String carCompany;
    String carModel;
    Engine engine;

    @Autowired
    public Car(@Value("Maruti Sujuki") String carCompany, @Value("Baleno") String carModel, Engine engine) {
        this.carCompany = carCompany;
        this.carModel = carModel;
        this.engine = engine;
        System.out.println("Car() ctor...."+carCompany+ " and "+carModel+ " and "+this.engine.engineModel);

    }



   
}