package com.java.interviewquestions;
import java.util.Scanner;
public class PrimeNumbers {
	static boolean isPrime(int num){
		boolean  status = true;
		if(num == 0 || num == 1) {
			status = false;
		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				status = false;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number where you want to print:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Prime numbers upto " + num + "");
		for(int i =1; i<=num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
