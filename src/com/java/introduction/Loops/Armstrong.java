package com.java.introduction.Loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int r = 0;
		int sumP = 0;
		int digitCount = 0;
		int n1 =num;
		int temp = num;
		while(num>0) {
			num = num/10;
			digitCount ++;
		}
		while(n1>0) {
			r = n1%10;
			n1 = n1/10;
			sumP = (int) (sumP+Math.pow(r, digitCount));
		}
		if(sumP == temp) {
			System.out.println("Given Number is Armstrong");
		}
		else {
			System.out.println("Given number is not an Armstrong");
		}
	}

}
