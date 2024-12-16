package com.springdemo.SpringFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Devloper {
    @Value("4")
    private int age;

    @Autowired
    Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void coding(){
        laptop.compile();
    }
}
