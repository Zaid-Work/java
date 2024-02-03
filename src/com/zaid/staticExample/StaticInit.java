package com.zaid.staticExample;

//this is a demo to show static variable init
public class StaticInit {
    static int a = 4;
    static int b = 5;

    // will only run once when the first object is created
    static {
        System.out.println("I am in static block");
        b = a + 5;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();
        System.out.println(obj.a + " " + obj.b);

        StaticInit.b += 3;

        StaticInit obj2 = new StaticInit();
        System.out.println(a + " " + b);
    }

}
