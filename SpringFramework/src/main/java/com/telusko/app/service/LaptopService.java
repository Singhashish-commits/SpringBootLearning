package com.telusko.app.service;

import com.telusko.app.Repository.LaptopRepository;
import com.telusko.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // service and the component does the same thing
public class LaptopService {
    @Autowired
   private LaptopRepository repo1 ;
   public void addLaptop(Laptop lap) {
       repo1.save(lap);
       System.out.println("Method called in service layer ");

   }
   public boolean isGoodForProg(Laptop lap){
       return true;
   }

}
