package com.telusko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu c1;
    public void compile(){
        System.out.println("Code compiled on the Laptop");
        c1.Strength();
    }
}
