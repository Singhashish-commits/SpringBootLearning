package com.telusko.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
    @Value("23")
    private int age;

    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }
    @Autowired
    @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
//        System.out.println("Coding");
       comp.compile();
    }

}
