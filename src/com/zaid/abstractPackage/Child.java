package com.zaid.abstractPackage;

public class Child extends Parent{
    Child(int age){
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("I am going to be " + name);
    }

}
