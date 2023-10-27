package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//what is in xml driven configuration = scope=prototype
@Component("myBengalTiger") // <bean>
@Scope("prototype") // what is used to specify the bean loading strategy in annotation driven configuraion = @Scope("prototype")
class BengalTiger extends Tiger {  

    @Autowired
    BengalTiger(@Value("Johny")
         String name) {
        super(name);
        System.out.println("BengalTiger() constructed...."+name);
    }
}
