package com.java.arrays;

import java.util.Scanner;

//WAP to convert decimal number into binary!!
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Converting a number from Decimal to Binary!!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int arr = scanner.nextInt();
		int size[] = new int[arr];

		System.out.println("Enter the array elements:");
		for (int i = 0; i < size.length; i++) {
			size[i] = scanner.nextInt();

		}
		System.out.println("Array Elements are : ");
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);
		}
		for (int i = 0; i < size.length; i++) {
			int num = size[i];
			int binary = 0;
			int rem;
			int place = 1;
			while (num > 0) {
				rem = num % 2;
				binary = binary + rem * place;
				num = num / 2;
				place = place * 10;
			}
			System.out.println("Binary number of " + size[i] + ": is : " + binary);
		}
	}

}
