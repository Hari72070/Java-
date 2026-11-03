package com.java.introduction;

import java.util.Scanner;

public class BankAccount {
	double balance = 100000.00;

	void main(String[] args) {
		System.out.println("Welcome to Yeagerist Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		addition(a, b);
		substraction(a, b);
		multiplication(a, b);
		remainder(a, b);
		quotient(a, b);
	}

	void addition(int a, int b) {
		System.out.println("The addition of two numbers is " + (a+b));
	}

	void substraction(int a, int b) {
		System.out.println("The substraction of two numbers is " + (a-b));
	}
	void multiplication (int a, int b) {
		System.out.println("The multiplication of two numbers is " + (a*b));
	}
	void quotient(int a, int b)
	{
		System.out.println("The  quotient of two numbers is " + (a/b));
	}
	void remainder(int a, int b) {
		System.out.println("The remainder of two numbers is " + (a%b));
	}
}
