package com.java.arrays.algorithms;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = {9,2,4,6,1,7,8,3,5};
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length -i -1; j++) {
				if(arr[j] >arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting arrays : ");
		System.out.println(Arrays.toString(arr));
		
		for(int k =0; k<arr.length; k++) {
			for(int l= 0 ; l<arr.length; l++) {
				
			}
		}
	}

}
