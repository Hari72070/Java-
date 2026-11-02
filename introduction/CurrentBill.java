package com.java.introduction;

import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {

		System.out.println("Calculating the current Bill of Domestic  and Commercial users!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the connection type: ");
		String connection = sc.next();
		switch (connection) {
		case "domestic" -> {
			double bill = 0;
			System.out.println("Enter the number of units consumed");
			int units = sc.nextInt();
			if (units <= 100) {
				bill = units * 2;
				System.out.println("Rate per unit is : 2/-");
				System.out.println("The Current bill is : " + bill);
			} else if (units > 100 && units <= 300) {
				bill = units * 2.5;
				System.out.println("Rate per unit is : 2.5/-");
				System.out.println("The Current bill is : " + bill);
			} else {
				bill = units * 3;
				System.out.println("Rate per unit is : 3/-");
				System.out.println("The Current bill is : " + bill);
			}
		}
		case "commercial" -> {
			double bill = 0;
			System.out.println("Enter the number of units consumed");
			int units = sc.nextInt();
			if (units <= 100) {
				bill = units * 4;
				System.out.println("Rate per unit is : 4/-");
				System.out.println("The Current bill is : " + bill);
			} else if (units > 100 && units <= 300) {
				bill = units * 6;
				System.out.println("Rate per unit is : 6/-");
				System.out.println("The Current bill is : " + bill);
			} else {
				bill = units * 8;
				System.out.println("Rate per unit is : 8/-");
				System.out.println("The Current bill is : " + bill);
			}
		}
		default -> System.out.println("Please select valid Connection name");
		}

	}

}

//1.Write a Java program to calculate the electricity bill based on the connection type and the number 
// of units consumed.
//
//Requirements:
// > Ask the user to enter   connection type
//a) → Domestic
//b) → Commercial
//› Using switch case to determine the selected connection type.
//› Ask the user to enter the number of units consumed.
//
//a) Domestic Connection:
//› If units are 100 or less, charge 2 per unit.
//If units are greater than 300 charge 3 change a per unit 
//
//b) Commercial Connection:
//› If units are 100 or less, charge 4 per unit.
//› If units are greater than 100 and up to 300, charge 6 per unit.
//› If units are greater than 300, charge 8 per unit. Atlast, display the following details:
//Connection Type
//Units Consumed
//Rate Per Unit
//Total Electricity Bill