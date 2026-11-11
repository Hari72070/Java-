package com.java.LinkedinContent;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Comparison Operators
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical Operators
        System.out.println(a < b && b > 10);
        System.out.println(a > b || b > 10);
        System.out.println(!(a < b));

        // Short-Circuit Evaluation
        int x = 5;

        System.out.println(false && (++x > 5));
        System.out.println("Value of x: " + x);
    }
}