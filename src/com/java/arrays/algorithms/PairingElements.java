package com.java.arrays.algorithms;

public class PairingElements {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6,7,9,10};
		int i =0; 
		int j = arr.length-1;
		System.out.println("After pairing the elements : ");
		while(i<j) {
			System.out.println("[ " + arr[i] + " ," + arr[j] + "]");
			i++;
			j--;
		}
		if(i == j) {
			System.out.println("Middle element is : " + arr[i]);
		}
	}

}
