package com.java.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Enter to the World of DSA!!");
		System.out.println("Enter the size of the array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the array elemnts : ");
		for(int i=0;i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		boolean found = false;
		System.out.println("Enter the element you want to found : ");
		int key = scanner.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Element found at position " + i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element not found!!");
			
		}
	}

}
