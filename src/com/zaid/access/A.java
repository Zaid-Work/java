package com.zaid.access;

public class A {
    private int num;
    String name;
    int []arr;

    public int getNum(){
        return num;
    }
    public A(int num,String name){
        this.name = name;
        this.num= num;
        this.arr = new int[num];
    }
}
