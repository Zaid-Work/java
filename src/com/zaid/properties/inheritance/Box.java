package com.zaid.properties.inheritance;

public class Box {
    private double ll;
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey in box class");
    }
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.w = this.l = this.h = side;
    }

    Box(double l, double h, double w){
        System.out.println("Box Constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running box");

    }

}
