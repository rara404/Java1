package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {
    static ArrayList<String> history = new ArrayList<>();

    public static void add(int a, int b){
        int result = a+b;
        System.out.println("Result: " + result);
        history.add(a + " + " + b + " = " + result);
    }

    public static void sub(int a, int b){
        int result = a-b;
        System.out.println("Result: " + result);
        history.add(a + " - " + b + " = " + result);
    }

    public static void mul(int a, int b){
        int result = a*b;
        System.out.println("Result: " + result);
        history.add(a + " * " + b + " = " + result);
    }

    public static void div(int a, int b){
        if(b == 0) {
            System.out.println("Denominator is zero");
            return;
        }
        int result = a/b;
        System.out.println("Result: " + result);
        history.add(a + " / " + b + " = " + result);
    }
}
