package com.java.arrays;

import java.util.Scanner;

//WAP to convert Binary number into Decimal!!
public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Converting the Binary Number into Decimal");
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
			int decimal = 0;
			int place = 1;
			while (num > 0) {
				int rem = num % 10;
				decimal = decimal + rem * place;
				num = num / 10;
				place = place * 2;
			}
			System.out.println("Decimal number of " + size[i] + ": is : " + decimal);

		}
	}

}
