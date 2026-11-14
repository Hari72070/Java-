package com.java.interviewquestions;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean status = true;
		if(num == 0 || num ==1) {
			status = false;
		}
		for(int i=2; i<num; i++) {
			if (num %i ==0) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not a prime");
		}
	}

}
