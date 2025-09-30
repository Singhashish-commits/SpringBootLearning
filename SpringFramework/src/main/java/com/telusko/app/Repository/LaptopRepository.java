package com.telusko.app.Repository;

import com.telusko.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Data Saved in the DataBase");


    }
}
