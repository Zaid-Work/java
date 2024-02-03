package com.zaid.abstractPackage;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
    }
    static void hello(){
        System.out.println("hello");
    }
    abstract void career(String name);
}
