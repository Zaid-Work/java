package com.zaid.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int []arr;
    Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr= new int[]{2,3,4,3,2};
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
