package com.java.arrays;

//1.Write a Java program to count even and odd elements in an array.

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr = scanner.nextInt();
		int size[] = new int[arr];
		int evencount = 0;
		int oddcount = 0;
		System.out.println("Enter the array elements:");
		for (int i = 0; i < size.length; i++) {
			size[i] = scanner.nextInt();

		}
		System.out.println("Array Elements are : ");
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);
		}
		for (int i = 0; i < size.length; i++) {
			if (size[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println("Total Even numbers count is : " + evencount);
		System.out.println("Total Odd numbers count is : " + oddcount);
	}

}
