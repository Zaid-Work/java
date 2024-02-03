package com.zaid.properties.polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num = num;
    }

    // method of global Object class
    @Override
    public String toString() {
        return "random overrding";
    }

    public static void main(String[] args) {
        Object obj = new ObjectPrint(2);
        System.out.println(obj);
    }
}
