package com.practice;

public class A {
    int num1;

   public A() {
       System.out.print("default constructor of A");
   }
    public A(int a){
        System.out.print("parameterized constructor of A");

    }

    @Override
    public String toString() {
        System.out.println("Some changes right now on 11/6");
        return "to String of A";
    }


}
