package org.spring;

public class Laptop implements computer {

    public Laptop() {
        System.out.println("Laptop constructor");
    }
    @Override
    public void compile(){
        System.out.println("compiling with Laptop");
    }
}
