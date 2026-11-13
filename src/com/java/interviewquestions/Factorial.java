package com.java.interviewquestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number you want to find factorial of: ");
		int num = scanner.nextInt();
		int fact =1;
		for(int i= num;i>0;i--) {
			fact = fact*i;
		}
		System.out.println("The factorial of the " +num + " is : " + fact);
	}

}
