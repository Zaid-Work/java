package com.zaid.staticExample;

public class Humans {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void message(){
        System.out.println("Hello World");
//        System.out.println(this);
//    can't access this from static
    }

    public Humans(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Humans.population+=1;
    }


}
