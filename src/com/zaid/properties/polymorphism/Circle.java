package com.zaid.properties.polymorphism;

public class Circle extends Shapes{
    //method overriding
    @Override // used for check purpose
    void area(){
        System.out.println("area is pi * r * r");
    }
}
