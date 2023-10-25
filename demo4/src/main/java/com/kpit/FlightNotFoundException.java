package com.kpit;

public class FlightNotFoundException extends RuntimeException {
    
    public FlightNotFoundException(String str) {
        super(str);
    }
}
