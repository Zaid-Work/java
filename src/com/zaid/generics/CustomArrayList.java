package com.zaid.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object []temp = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public void getList(ArrayList<? extends Number>list){
        //hello
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        String s = "[";
        for(int i = 0; i < size-1; i++){
            s += data[i] + " ";
        }
        s += data[size-1];
        s += "]";
        return s;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(34);
//        list.remove(0);
//        list.get(0);
        CustomArrayList<Integer> c = new CustomArrayList();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        System.out.println(c);
        ArrayList<Integer>a = new ArrayList<>();
        // integer -> generics
    }
}
