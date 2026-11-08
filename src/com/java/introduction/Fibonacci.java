package com.java.introduction;

import java.util.Scanner;

public class Fibonacci{

	public static void main(String[] args) {
		System.out.println("Printing the fibonacci series of nth number");
		
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int f = 0;
		int s = 1;
		
		for(int i = 1 ;i<n; i++ ) {
			int fibbo = f+s;
			f = s;
			s = fibbo;
			System.out.print(" " + fibbo);
		}
	}

}

 // 0 1 1 2 3 5 8 13 21 34 55 99