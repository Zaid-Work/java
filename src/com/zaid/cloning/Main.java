package com.zaid.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human a = new Human(23,"Zaid");
//        Human twin =new Human(a);
        Human twin = (Human)a.clone();
        System.out.println(twin.age + " " + twin.name);

    }
}
