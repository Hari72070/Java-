package com.java.arrays;

import java.util.Arrays;
//2.Write a java program  to rounding of elements in given array
//Eg: arr[]={99,95,71,84,81,75,60}
//Output: {100,90,70,80,80,70,60}
public class RoundingElements {

	public static void main(String[] args) {
		int[] arr = {99,95,71, 84, 81, 75, 60};
		for(int i=0;i<arr.length; i++) {
			int rem = arr[i]% 10;
			if(rem >5) {
				arr[i] = (arr[i]-rem) + 10;
			}else if(rem <=5) {
				arr[i] = arr[i]- rem;
			}
		}
		System.out.println("Array after Rounding up the values : ");
		System.out.println(Arrays.toString(arr));
	}

}


