package com.java.interviewquestions;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to print the fibonacci : ");
		int num = scanner.nextInt();
		int f1 = 0;
		int f2 = 1;

		for(int i=1; i<num;i++) {
			int fact = f1 + f2;
			System.out.print(" " + fact);
			f1 = f2;
			f2 = fact;
			
		}
	}

}
