package com.java.LinkedinContent;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum =0;
		while(num>0) {
			int n1 = num %10;
			num = num/10;
			sum = sum +n1;
		}
		System.out.println("The sum of the digits are : " + sum);
	}

}
