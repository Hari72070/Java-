package com.java.introduction;

public class PrimeNumbers {

	static boolean isPrime(int n) {
		boolean Status = true;
		if(n==0 || n==1) {
			return false;
		}
		for (int i = 2; i < n; i++){
			if(n%i == 0) {
				return false;
			}
		}
		return Status;
	}
	
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100");
		
		for (int i = 1 ; i<=100; i++) {
			boolean flag = isPrime(i);
			if(flag) {
				System.out.print(" " + i);
			}
		}
	}

}


//1. Write a java program to Print all prime numbers from 1 to 100.
//2. Write a java program for Reverse a number and check number is palindrome or not