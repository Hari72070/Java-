package com.java.introduction;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you want to print :");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of the numbers that are divisible by 3 & 5 are :" + sum);

	}

}
// Write a Java program to find the sum of all numbers from 1 to N that are divisible
// by both 3 and 5 using a for loop.