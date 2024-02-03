package com.zaid.generics.comparing;

public class Compatre implements Comparable<Compatre> {
    int rollno;
    int marks;
    Compatre(int marks, int rollno){
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Compatre o) {
        return this.marks-o.marks;
    }
}
