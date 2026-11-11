package com.java.arrays;

public class MinMax {
	public static void main(String[] args) {
		int num[] = {10,15,12,13,14,16,19,18,99,49,45,26,1};
		int min = num[0];
		int max = num[0]; 
		
		for(int i:num) {
			if(i<min) {
				min = i;
			}else if(i>max) {
				max = i;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
