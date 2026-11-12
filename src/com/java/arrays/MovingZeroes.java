package com.java.arrays;

import java.util.Scanner;

public class MovingZeroes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int num[] = new int[size];
		int index = 0;
		System.out.println("Enter the array elements");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.println("The array elements are : ");

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				num[index] = num[i];
				index++;
			}
		}
		while(index<num.length) {
			num[index] = 0;
			index ++;
		}
		System.out.println("\nArray after moving zeros to the end : ");
		for (int i = 0; i < num.length; i++) {
		    System.out.print(num[i] + " ");
		}
	}

}

//Write java program to moves all zero to end
//eg: arr={1,0,3,2,0,9,0,8,0,7}
//output: {1,3,2,9,7,0,0,0,0}