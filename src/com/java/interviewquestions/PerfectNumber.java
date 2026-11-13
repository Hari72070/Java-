package com.java.interviewquestions;

import java.util.Scanner;
//WAP to check whether the given number is perfect or not!!
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number you want to check");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean status = false;
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				sum = sum+i;
			}
		}
		if(num == sum) {
			status = true;
		}
		if(status) {
			System.out.println("Given number is perfect");
		}
		else {
			System.out.println("Given number is not perfect");
		}
	}

}
