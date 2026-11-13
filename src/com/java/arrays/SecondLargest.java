package com.java.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i =0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.println("The Array Elements are : ");
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i] + " ");
		}
		int max = num[0];
		int secondmax = num[0]; 
		for(int i=1; i<num.length;i++) {
			if(num[i]>max) {
				secondmax = max;
				max = num[i];
			}
			else if (num[i] > secondmax && num[i] != max) {
				secondmax = num[i];
			}
		}
		System.out.println("The maximum element is : " + max);
		System.out.println("The second max elemnt is : " + secondmax);
	}

}

//write java program to find second largest distinct element in array
//eg: arr={2,7,13,9,8,13}
//output : distinct second element is 9