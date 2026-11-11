package com.java.arrays;

import java.util.Scanner;

//WAP to return the String values from the console using scanner
public class StringReadScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = scanner.nextInt();
		String names[] = new String[size];
		System.out.println("Enter the strings");
		for(int i= 0; i<size; i++) {
			names[i] = scanner.next();
		}
		System.out.println("Array elements are: ");
		for(String n: names) {
			System.out.println(n + " ");
		}

	}

}
