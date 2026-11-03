package com.java.introduction.Loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Printing the reverse of numbers!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range that you want to print!!");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
	}

}
