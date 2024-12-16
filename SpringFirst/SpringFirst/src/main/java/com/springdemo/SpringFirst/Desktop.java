package com.springdemo.SpringFirst;

public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling with Desktop");
    }
}
