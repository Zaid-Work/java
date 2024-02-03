package com.zaid.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // access method due to Shapes class
        // but accessing the area method of circle class
        // so this is due to overriding
        // Upcasting
        // Dynamic Method Dispatch
        Circle circle = new Circle();
        Shapes square = new Square();
        shape.area();
        circle.area();
        square.area();
    }
}
