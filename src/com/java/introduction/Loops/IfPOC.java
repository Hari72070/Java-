package com.java.introduction.Loops;

import java.util.Scanner;

public class IfPOC {
	public static void main(String[] args) {
		System.out.println("======Welcome to Kalinga's Matrimony!!======");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = scanner.next();
		System.out.println("Nice to meet you Mr." + name);
		System.out.println("Please enter your total assets : ");
		double assets = scanner.nextDouble();
		
		if (assets >= 20000000.00) {
			System.out.println("Glad to hear that ");
			System.out.println("Please enter your Salary : ");
			double salary = scanner.nextDouble();
			
			if (salary >= 2500000.00) {
				System.out.println("Oh! Good to hear, Shall we proceed with other formalities!!");
				System.out.println("Please enter your age: ");
				int age = scanner.nextInt();
				
				if (age > 25 && age < 31) {
					System.out.println("Your profile is matching and we have some more queries to ask!!");
					System.out.println("Do you have your own house?");
					boolean ownHouse = scanner.nextBoolean();
					
					if (ownHouse) {
						System.out.println("Congrats you are eligible for this profile!!");
						System.out.println("Does the bride agree ? ");
						boolean bride = scanner.nextBoolean();
						
						if (bride) {
							System.out.println("Shall we talk about formalities!!");
						} else {
							System.out.println("Sorry! Bride is not intrest in you!!");
						}
					} else {
						System.out.println("We have some requirements");
					}
				} else {
					System.out.println("Sorry your age is not matched");
				}
			} else {
				System.out.println("Sorry! We are looking for others");
			}
		} else {
			System.out.println("Sorry We are looking for the better background");
		}
	}
}
