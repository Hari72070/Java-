package com.java.introduction.Loops;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		System.out.println("Working with booleans!!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you attending to classes!!");
		boolean areYouAttending = scanner.nextBoolean();
		System.out.println("Are you attending to exams!!");
		boolean areYouExams = scanner.nextBoolean();
		
		if(areYouAttending && areYouExams) {
			System.out.println("Well done my boy!!");
		}
		else {
			System.out.println("You gonna cooked up!!");
		}
	}

}
