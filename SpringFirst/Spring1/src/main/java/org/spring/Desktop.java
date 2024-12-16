package org.spring;

public class Desktop implements computer{
    public Desktop() {
        System.out.println("Desktop constructor");
    }
    @Override
    public void compile() {
        System.out.println("compiling with desktop");
    }
}
