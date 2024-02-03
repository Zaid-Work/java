package com.zaid.abstractPackage;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(24);
        child.career("Doctor");
        Parent.hello();
        // can't create object of abstract classes

    }
}
