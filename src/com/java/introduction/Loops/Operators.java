package com.java.introduction.Loops;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Assignment Operators
        a += 2;
        System.out.println("After Assignment: " + a);

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Unary Operators
        System.out.println("Pre-Increment: " + (++a));
        System.out.println("Post-Increment: " + (a++));
        System.out.println("After Post-Increment: " + a);
        System.out.println("Pre-Decrement: " + (--b));
        System.out.println("Unary Minus: " + (-b));
    }
}