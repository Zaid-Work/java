package com.zaid.singleton;

import com.zaid.access.A;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
          Singleton ob1  = Singleton.getInstance();
        Singleton obj2  = Singleton.getInstance();
        Singleton obj3  = Singleton.getInstance();
// all three ref variables points to one object

        A a = new A(10,"Zaid");

    }
}
