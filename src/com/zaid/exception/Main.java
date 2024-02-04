package com.zaid.exception;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            throw new MyException("error");
//            divide(a,b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("executed");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("errrrrorrrrr");
        }
        return a / b;
    }
}
