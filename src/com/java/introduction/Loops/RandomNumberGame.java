package com.java.introduction.Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean guessed = false;
		int count = 0;
		String y;
		do {
			int num = (int) (Math.random() * 100) + 1;
			do {
				System.out.println("Please enter the guessed number");
				int guess = scanner.nextInt();
				if (guess == num) {
					System.out.println("Congrats you guessed the correct number : " + num);
					guessed = true;
					break;
				} else if (guess < num) {
					System.out.println("Your guessed number is too low");
				} else if (guess > num) {
					System.out.println("Your guessed number is too high");
				}
				count ++;
			}while (count < 3 && !guessed);
			
			if (guessed == false) {
			    System.out.println("Game Over! The correct number is: " + num);
			}
			System.out.println("Do you want to play another item? (y/n)");
			scanner.nextLine();
			y = scanner.nextLine();
			count = 0;
			guessed = false;

		}while(y.equalsIgnoreCase("Y"));
		
	}
}


//Write a Java program to develop a random number guessing game with the following requirements:
//1.Generate a random number between 1 and 100.
//2.Allow the user a maximum of 3 chances to guess the correct number.
//3.If the guessed number is less than the random number, display "Too Low! Try Again."
//4.If the guessed number is greater than the random number, display "Too High! Try Again."
//5.If the user guesses correctly, display "Congratulations! You guessed the correct number."
//and stop the game.
//6.If the user fails to guess the number within 3 chances, display "Game Over!" and 
//reveal thecorrect number.