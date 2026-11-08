package com.java.introduction;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number you want to check!!");
		int num = scanner.nextInt();
		int sum = 0;
		int digit = 0;
		while(num>9) {
			sum = 0;
			while(num>0) {
				digit = num%10;
				num = num/10;
				sum = sum +digit;
			}
			num = sum;
		}
		if(sum ==1) {
			System.out.println("Given number is magical number!!");
		}
		else {
			System.out.println("Given number is not a magical number!!");
		}
	}

}
// 4411%10 = 1 441%10 = 1
// 4411/10 = 441 441/10 = 44
// sum = 1