package com.java.arrays;

import java.util.Scanner;

//2.Write a Java program to count positive and negative elements in an array.
public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println("Counting Positive and Negative numbers in an Array!!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int arr = scanner.nextInt();
		int size[] = new int[arr];
		int PosCount = 0;
		int NegCount = 0;
		
		for(int i= 0; i<size.length; i++) {
			size[i] = scanner.nextInt();
		}
		System.out.println("Enter the array elements!!");
		for(int i=0; i<size.length;i++) {
			System.out.println(size[i]);
		}
		for (int i = 0; i < size.length; i++) {
			if(size[i]>0) {
				PosCount++;
			}
			else if(size[i]<0) {
				NegCount++;
			}
		}
		System.out.println("Positive count is : "+ PosCount);
		System.out.println("Negative count is : "+ NegCount);
	}
	

}
