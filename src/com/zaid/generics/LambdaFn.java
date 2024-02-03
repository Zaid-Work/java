package com.zaid.generics;

import java.util.*;
import java.util.function.Consumer;

public class LambdaFn {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i = 0; i < 13; i++)arr.add(i +1);
        arr.forEach((ele) -> {
            System.out.println(ele * 2);
        });
        Collections.sort(arr);
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum =  (a,b) -> a + b;
        Operation diff =  (a,b) -> a - b;
        Operation mult =  (a,b) -> a * b;
        Comparator<Integer> fun2 = (Integer a, Integer b) -> b-a;
        arr.sort(fun2);
        System.out.println("After sorting");
        for(Integer ele : arr){
            System.out.println(ele);
        }


    }
    int sum(int a,int b){
        return a + b;
    }
}

interface Operation{
    int op(int a,int b);
}