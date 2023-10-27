package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/* 
@Configuration
@ComponentScan("com.kpit")
class Config {
    @Bean
    public String name() {
        System.out.println("name() from Config");
        return "Jack";
    }
}
*/


@Component("myTiger")
@Scope("prototype")
public class Tiger {
    String name;

    @Autowired
    Tiger( @Value("Jacky") 
        String name) {
        this.name=name;
        System.out.println("Tiger() created..."+name);
    }   
}
