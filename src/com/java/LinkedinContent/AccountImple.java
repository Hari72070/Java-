package com.java.LinkedinContent;

public class AccountImple {

	public static void main(String[] args) {
		Accounts a = new Accounts();
		
		a.setAccountNumber(3982083);
		a.setBalance(600000.00);
		a.setName("Harinadh");
		
		System.out.println("Account Number is : " + a.getAccountNumber());
		System.out.println("Account Balance is : " + a.getBalance());
		System.out.println("Account Holder name is : " + a.getName());
	}

}
