package com.zaid.properties.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(new Box(1.2,3.12,12.2));
//        System.out.println(box.l + " " + box.h + " " + box.w);
//        BoxWeight box1 = new BoxWeight(1,2,3,4);
//        System.out.println(box1.l + " " + box1.weight);
        // type of reference variable determines what is the
        // accessible methods and variables
    Box.greeting();
    Box b = new BoxWeight();
    b.greeting();
        //you can inherit but can't override static methods
        ArrayList array = new ArrayList();
        array.add(2);

    }
}
