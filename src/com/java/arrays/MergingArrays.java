package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of A array : ");
		int asize = scanner.nextInt();
		int[] a = new int[asize];
		System.out.println("Enter the size of B array");
		int bsize = scanner.nextInt();
		int[] b = new int[bsize];
		System.out.println("Enter the array A elements");
		for(int i = 0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Enter the array B elements");
		for(int i=0; i<b.length; i++) {
			b[i] = scanner.nextInt();
		}
		int c[] = new int[a.length + b.length];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}for(int i=0; i<b.length; i++) {
			c[a.length + i] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}
