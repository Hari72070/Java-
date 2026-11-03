package com.java.introduction;

import java.util.Scanner;

public class Returntypeonly {

	int runsscored;
	int overs;

	public static void main(String[] args) {

		System.out.println("Run rate calculator");
		Returntypeonly r = new Returntypeonly();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of runs scored:");
        r.runsscored = sc.nextInt();
        System.out.println("Enter total number of completed Overs");
        r.overs = sc.nextInt();
		double result = r.runrate();
		System.out.println("Runs Scored: " + r.runsscored);
        System.out.println("Overs: " + r.overs);
		System.out.println("Current Run Rate: " + result);
	}
	double runrate() {
		double RunRate = (double) runsscored / overs;
		return RunRate;
	}
}