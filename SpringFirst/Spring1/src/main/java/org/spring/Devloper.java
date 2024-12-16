package org.spring;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


public class Devloper {

    private computer com;
    private int age;
    public Devloper(){
        System.out.println("Object Created");
    }
    //@ConstructorProperties({"age","lap"})
//    public Devloper(int age, Laptop lap){
//        System.out.println("Para C called");
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public computer getCom() {
        return com;
    }

    public void setCom(computer com) {
        this.com = com;
    }

    public void FirstCode(){

        System.out.println("Coding...");
        com.compile();
    }
}
