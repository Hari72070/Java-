package com.java.introduction;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		System.out.println("To check whether the number is Automorphic or not!!");
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num =  scanner.nextInt();
		int temp = num;
		int result = num * num ;
		int divisor = 1;
		while(temp>0) {
			divisor = divisor*10;
			temp = temp/10;
		}
		if(result %divisor == num) {
			System.out.println("Given number is Automorphic");
		}else {
			System.out.println("Given number is not Automorphic");
		}
	}

}

//1. Write Java program to check given number is automorphic number or not 
//Ex: 5 is automorphic
//5^2 -> 25 end with 5
//
//25 is automorphic
//25^2 -> 625 end with 25
//
//


//5 => 25
//15 => 225
//
