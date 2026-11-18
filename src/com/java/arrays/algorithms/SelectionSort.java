package com.java.arrays.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {9,4,1,7,6,2,3,8,5};
		int temp =0;
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]<minIndex) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
