package com.zaid.staticExample;

public class Main {
    // should be able to run main without creating the object of class Main
    public static void main(String[] args) {
        Humans Zaid = new Humans(21,"Zaid",100,false);
        Humans Anas = new Humans(21,"Anas",100,false);
        Humans Daksh = new Humans(21,"Daksh",100,false);

        System.out.println(Zaid.name);
        System.out.println(Humans.population);
//        greeting();

        Main funn = new Main();
        funn.fun2();
    }

    static void fun(){
        //belongs to the class Main
        // but the function greeting() depends on the instance
//        greeting();


        // get an object of non static method
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // which is not static belongs to object
    // belongs to an instance
    void greeting(){
//        fun();
    }
}
