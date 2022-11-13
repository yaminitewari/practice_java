package com.practice.com.practice;

import com.practice.A;

public class B extends A{
    int num2;

    public B(int a) {
       super(a);
        System.out.print("Constructor of B");
    }
   public B(int c) {
       super(a);
        System.out.print("Constructor of C");
    }
    public static void main(String[] args) {
        B b = new B(10);
    }
}
