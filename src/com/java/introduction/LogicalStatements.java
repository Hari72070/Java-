package com.java.introduction;

public class LogicalStatements {

	public static void main(String[] args) {
		
		System.out.println("Swapping of two variables!!");
		
		int a = 10;
		System.out.println("Entered a value is " + a);
		int b = 20;
		System.out.println("Entered b value is " + b);
	
		int temp = 0;
		temp = a+b;
		a = temp - a;
		b = temp - b;
		System.out.println("A value after swapping is : " + a);
		System.out.println("B value after swapping is : " + b);
		
		a = a+b;		
		b = a-b;
		a = a-b;
		System.out.println("A value after swapping is : " + a);
		System.out.println("B value after swapping is : " + b);
	}

}

//write a Java program to swap two numbers with using a third variable 