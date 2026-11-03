package com.java.introduction.Loops;

import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		System.out.println("Ternary Operations");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		String result = (n > 0 ? "Positive" : "Negative");
		System.out.println("The number is " + result);
	}

}

//1.check whether a number is positive or negative using Tenary Operator 
//2.Create a Java program for a Food Ordering System using switch-case.
//Requirements:
//Display the following menu:
//1 → Pizza – ₹200
//2 → Burger – ₹120
//3 → Biryani – ₹180
//4 → Noodles – ₹100
//Ask the user to select an item and enter the quantity.
//Calculate the total bill = item price × quantity.
//Output:
//Display the selected item, price, quantity, and total bill.
