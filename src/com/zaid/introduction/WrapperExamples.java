package com.zaid.introduction;

public class WrapperExamples {
    //java is pass by value not reference
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;
//        Integer num2 = 73;
//        //Integer is final -> can't be modified
//        //Integer -> wrapper class
//
//        swap(a,b);
//        swap(num,num2);
//        System.out.println(a + " " + b);
//        System.out.println(num + " " + num2);
//
//        final int BONUS = 2;
//        BONUS = 3;
//
//        final A random = new A("Hello");
//        random.name = "hdhdhd";
//        A random2 = new A("Bye");
//        random = random2;
//        can't do this since the object is final
//        A obj;
//        for(int i=0; i<1000000000;i++){
//            obj = new A("Random");
//        }

        A obj2 = new A("hello");
        System.out.println(obj2);

    }
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b= temp;
    }
}

class A{
    // final var always initialize them
    final int num = 10;
    String name;

    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object is destroyed");
    }
}
