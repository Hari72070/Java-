package com.java.LinkedinContent;

public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Bitwise Operators
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Complement: " + (~a));

        // Shift Operators
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Unsigned Right Shift: " + (a >>> 1));

        // Ternary Operator
        int largest = (a > b) ? a : b;

        System.out.println("Largest: " + largest);
    }
}