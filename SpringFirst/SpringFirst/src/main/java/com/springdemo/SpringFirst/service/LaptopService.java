package com.springdemo.SpringFirst.service;

import com.springdemo.SpringFirst.Model.Laptop;
import org.springframework.stereotype.Service;

//import com.telusko.app.model.Laptop;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop) {
        System.out.println("method called");

    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}

