package com.zaid.staticExample;

import java.util.Arrays;

//class Test{
//    static String name;
//    public Test(String name) {
//        Test.name = name;
//    }
//}
//static stuff -> compile time
public class InnerClass {
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Zaid");
        Test b = new Test("Anas");

        System.out.println(a + " " + "toString overidden");

        Arrays.toString(new int [] {1,2,3,4,5});
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// outside class can't be static since it is
// not dependent on some outer class
//static class A{
//
//}