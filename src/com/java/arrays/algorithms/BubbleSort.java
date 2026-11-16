package com.java.arrays.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Bubble sorting : ");
		System.out.println("Enter the size of array : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		int temp =0;
		System.out.println("Enter the elements : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Array before sorting : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting arrays : ");
		System.out.println(Arrays.toString(arr));
		
	}

}












