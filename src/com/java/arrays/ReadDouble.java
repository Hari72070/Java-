package com.java.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ReadDouble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = scanner.nextInt();
		Double grades[] = new Double[size];
		System.out.println("Enter the elements : ");
		for(int i = 0; i<size; i++) {
			grades[i] = scanner.nextDouble();
		}
		System.out.println("The Grades are : ");
		for(double n :grades) {
			System.out.println(n + " " );
		}
	}

}
