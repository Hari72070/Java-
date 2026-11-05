package com.java.introduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Checking whether the string is palindrome or not!!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num = scanner.nextInt();
		int original = num;
		int rev = 0;
		
		for(int i = num; i>=0; i--){
			int digit= num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		if(rev == original) {
			System.out.println("The given number is palindrome!!");
		}
		else {
			System.out.println("The given number is not a palindrome!!");
		}
	}
}


