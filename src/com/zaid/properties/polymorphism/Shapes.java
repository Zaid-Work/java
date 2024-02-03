package com.zaid.properties.polymorphism;

//compile time polymorphism -> method overloading
// since at compile time java have to decide
//which method to call
public class Shapes {
    //runtime polymorphism -> late binding
    //compile time polymorphism -> early binding
    void area(){
        System.out.println("I am in shapes");
    }
}
