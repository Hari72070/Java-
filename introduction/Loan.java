package com.java.introduction;

import java.util.Scanner;

public class Loan {

	String CustomerName;
	int LoanAmount;
	float IntrestRate;
	int LoanTenure;
	double intrest;
	
	void main(String[] args)
	{
		System.out.println("Loan Terms and Conditions");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		String CustomerName = sc.next();
		System.out.println("Enter Loan Amount : ");
		int LoanAmount = sc.nextInt();
		System.out.println("Enter Intrest Rate : ");
		Float IntrestRate = sc.nextFloat();
		System.out.println("Enter Loan Tenure (Years) : ");
		int LoanTenure = sc.nextInt();
		
		double intrest = calculateIntrest(LoanAmount, IntrestRate, LoanTenure);
		
		System.out.println("Total loan intrest is : " + intrest);
		
		double totalAmmount = LoanAmount + intrest;
		System.out.println("Total Amount with intrest is " + totalAmmount);
		
		double emi = EMI(totalAmmount, LoanTenure);
		System.out.println("Total Emi is : " + emi);
		sc.close();
	}
	
	double calculateIntrest(int p,	float r,int t) {
		
		double intrest = (p*t*r)/100;
		
		return intrest;
		
	}
	double EMI(double total, int t) {
		
		double emi = (total/(t *12));
		return emi;
	}
	double total(double intrest, double LoanAmount) {
		double total = intrest + LoanAmount;
		return total;
	}
}




//1.Create a Class Named as LoanManagement with following 
//variables 
//customerName, LoanAmount, interestRate, Loantenure - in years
//
//Methods
//calculateInterest()
//Accept loanAmount and interestRate as arguments.
//Calculate and return the simple interest.
//
//calculateTotalAmount ()
//Accept the calculated
//interest as an argument.
//Return the total amount payable.
//
//calculateMonthlyEMI():-
//Accept the total payable amount and loan tenure as arguments.
//Return the monthly EMI.
//
//displayLoanSummary():-
//Accept the interest,
//total amount, and EMI as arguments.
//
//Display the complete loan details.
//create atleast 2 different objects and different type of data and with every object call the method print the total in main with proper readability.