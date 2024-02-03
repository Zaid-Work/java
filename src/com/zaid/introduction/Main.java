package com.zaid.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []numbers = new int[5];

        String []names = new String[5];

        //data of 5 students
        int []rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

        //not creating an object
        //reference variable
        Student mystudent;
        mystudent=new Student();
        mystudent.rno=10;
        mystudent.name="Zaid";
        mystudent.marks=191.37f;
        System.out.println(mystudent.rno);
        System.out.println(mystudent.name);
        System.out.println(mystudent.marks);

//        System.out.println(mystudent.rno);
//        .some other property

        Student student2=new Student(727,"Anas",8282.882f);

//        System.out.println(student2);
        student2.greet();
        student2.changeName("Hello World");
        student2.greet();

        Student student3 = new Student(student2);

        System.out.println(student3.marks);
        System.out.println(student3.rno);
        System.out.println(student3.name);

        Student student4 = new Student();
        System.out.println(student4);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    void greet(){
        System.out.println("Hello my name is "+name);
    }

    void changeName(String name){
        this.name = name;
    }
    Student (Student other){
        this.name = other.name;
        this.marks=other.marks;
        this.rno=other.rno;
    }
    Student(){
        this(28,"yayayay",82.5f);
    }
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}