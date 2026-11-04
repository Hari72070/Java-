package com.java.introduction;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Printing factorial of numbers!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to print!! : ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=n; i>=1;i--) {
			fact = fact * (i);
		}
		System.out.println(fact);
	}
}
