package com.zaid.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Compatre s1 = new Compatre(12,23);
        Compatre s2 = new Compatre(12828,33);
        if(s1.compareTo(s2)<0){
            System.out.println("hello using compareTo");
        }
    }
}
