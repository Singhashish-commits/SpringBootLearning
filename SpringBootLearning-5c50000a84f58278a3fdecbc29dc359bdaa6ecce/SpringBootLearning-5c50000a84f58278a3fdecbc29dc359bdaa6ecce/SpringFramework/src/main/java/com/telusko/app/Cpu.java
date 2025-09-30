package com.telusko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
    @Autowired
    Ram r1;
    public void Strength(){
        System.out.println("Strength of the cpu");
        r1.capacity();
    }
}
