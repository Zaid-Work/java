package com.zaid.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
//    @Override
    static void greeting(){
        System.out.println("override");
    }

    BoxWeight (BoxWeight other){
        super(other);
        // Box b = new BoxWeight() -> same
        // b -> can only access w,l,h
    }
    BoxWeight (double side,double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h); // this? call the parent class constructor
        //used to initialize values in the parent class
        this.weight = weight;
    }
}
