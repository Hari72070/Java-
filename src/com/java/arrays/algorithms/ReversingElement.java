package com.java.arrays.algorithms;

import java.util.Arrays;

public class ReversingElement {

	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int rem = 0;
			int rev = 0;
			while(num>0) {
				rem= num%10;
				rev = rev *10 + rem;
				num = num/10;
			}
			arr[i] = rev;
		}
		System.out.println(Arrays.toString(arr));
	}

}

//1.Write a Java program to print Reverse of Element in the Given Array?
//i/p: int arr[]={11,12,13,14,15,16}; 
//o/p:	{11,21,31,41,51,61};