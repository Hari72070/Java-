package com.java.interviewquestions;

import java.util.Scanner;

//WAP to find the factors of a given number
public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to find the factors");
		int num = scanner.nextInt();

		boolean status = true;
		
		if(num == 0 || num == 1) {
			status = false;
		}
		for(int i=2; i<num; i++) {
			
			if(num %i == 0) {
				status = false;
				break;
			}
			status = true;
		}
		if(status) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("The given number is not a prime");
		}
	}

}
