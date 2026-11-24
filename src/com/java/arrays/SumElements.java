package com.java.arrays;

import java.util.Arrays;

public class SumElements {

	public static void main(String[] args) {
		int [] arr =  {10,20,30,40,50,60};
		int[] result = new int[arr.length];
		int curr;
		int next;
		int prev; 
		
		for(int i=0; i<arr.length; i++) {
			curr = i;
			if(curr == 0) {
				next = arr[curr+1];
				result[curr] = arr[curr] + next; 
			}
			else if (curr == arr.length - 1) {
				prev = arr[curr-1];
				result[curr] = arr[curr] + prev;
			}
			else if(curr!=0) {
				prev = arr[curr-1];
				next = arr[curr +1];
				result[curr] = prev + next;
			}
		}
		System.out.println(Arrays.toString(result));
		
	}

}


//
// Write a Java Program to create  a new array where each element is the sum of the 
// previous and next element of the given array? 
// i/p: int arr[]={10,20,30,40,50,60};
// O/p: {30,40,60,80,100,110};