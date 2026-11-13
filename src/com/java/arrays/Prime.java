package com.java.arrays;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 2; i < num.length; i++) {
			boolean status = true;
			if(num[i]<= 1) {
				status = false;
			}
			else {
				for (int j = 2; j < num.length; j++) {
					if(num[i]%j == 0) {
						status = false;
						break;
					}
					status = true;
				}
			}
		if(status) {
			 System.out.println(num[i] + " is a Prime Number");
		}
		
	}

	}
}

