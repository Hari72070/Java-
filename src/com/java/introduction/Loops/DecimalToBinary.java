
package com.java.introduction.Loops;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Decimal number:");
        int num = scanner.nextInt();

        int binary = 0;
        int place = 1;

        while (num > 0) {
            int rem = num % 2;

            binary = binary + rem * place;

            num = num / 2;

            place = place * 10;
        }

        System.out.println("Binary number is: " + binary);
    }
}
