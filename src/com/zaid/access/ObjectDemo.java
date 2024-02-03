package com.zaid.access;

public class ObjectDemo {
    int num;
    ObjectDemo(int num){
        this.num = num;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(23);
        System.out.println(obj.hashCode());
        // .equals -> content of object
        // == -> pointing to the same variable
        // in heap
        // abstract methods -> needs to be overridden
    }
}
