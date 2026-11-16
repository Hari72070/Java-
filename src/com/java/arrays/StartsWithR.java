package com.java.arrays;

import java.util.Scanner;

public class StartsWithR {

	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scanner.next();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i].toLowerCase().startsWith("r") && arr[i].endsWith("t")) {
				System.out.println(arr[i]);
				
			}
		}
	}

}
