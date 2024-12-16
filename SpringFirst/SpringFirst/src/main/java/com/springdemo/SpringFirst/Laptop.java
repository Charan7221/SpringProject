package com.springdemo.SpringFirst;

import org.springframework.stereotype.Component;

@Component("FirstLaptop")
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling With Laptop...");
    }
    public void addLaptop(){
        System.out.println("Adding Laptop...");
    }
}
