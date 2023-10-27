package com.kpit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
 public class Bear {
   
    Bear() {
        System.out.println("Bear() created...");
    }   
    void fetchHoney() {
        System.out.println("Bear is fetching Honey....");
    }
}