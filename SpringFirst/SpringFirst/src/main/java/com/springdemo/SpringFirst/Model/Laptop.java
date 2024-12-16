package com.springdemo.SpringFirst.Model;

import org.springframework.stereotype.Component;

@Component("ModelLaptop")
public class Laptop implements Computer{


    public void compile() {

        System.out.println("Compiling in Laptop");
    }

}
