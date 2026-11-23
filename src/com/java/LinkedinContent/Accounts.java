package com.java.LinkedinContent;

public class Accounts {
	private double accountNumber;
	private double balance;
	private String name;
	
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance = balance;
		}
		else {
			System.err.println("Enter the valid amount!!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
