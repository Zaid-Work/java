package com.zaid.interfaces;

public class Car implements Engine,Brake{

    @Override
    public void brake() {
        System.out.println("I brake like normal");
    }

    @Override
    public void start() {
        System.out.println("I start like normal");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal");
    }

    @Override
    public void acc() {
        System.out.println("I acc like normal");
    }
}
