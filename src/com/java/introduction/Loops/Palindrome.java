package com.java.introduction.Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int rev = 0;
		int original = num;
		while(num>0) {
			int rem = num%10;
			num = num/10; 
			rev = rev *10 + rem;
		}
		if(rev == original) {
			System.out.println("The given number is palindrome !!");
		}
		else {
			System.out.println("The given number is not a palindrome !!");
		}
	}

}
