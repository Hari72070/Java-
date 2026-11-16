package com.java.arrays;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int b [] = {1,20,30,40,50};
		int c [] = new int[5];
		for(int i =0; i<a.length; i++) {
			c[i] = a[i] + b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
