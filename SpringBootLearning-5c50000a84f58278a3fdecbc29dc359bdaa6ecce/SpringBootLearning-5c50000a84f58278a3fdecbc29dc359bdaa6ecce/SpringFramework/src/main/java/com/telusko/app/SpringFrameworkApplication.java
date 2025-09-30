package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);

        System.out.println("Hello World");
        Alien obj = context.getBean(Alien.class);
//         if we want  spring to create obj we have to do like
        Alien obj2 = context.getBean(Alien.class);
//        obj2.code(); // object created by the spring
//        obj.code();
        if( obj2== obj){
            System.out.println("Sam eobject created  or the duplicate ");
        }
        Alien obj3 = context.getBean(Alien.class);
        obj.code();
    }

}
