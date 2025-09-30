package com.telusko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
    @Autowired
    Laptop laptop;
    public void code(){
//        System.out.println("Coding");
        laptop.compile();
    }

}
