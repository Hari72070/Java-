package com.java.introduction.Loops;

import java.util.Scanner;

public class EmployeeClass {
	int id;
	String name;
	double salary;
	double bonus;
	double total_salary;
	EmployeeClass(int i, String n, double s){
		id = i;
		name = n;
		salary = s;
	}

	public static void main(String[] args) {
	
		System.out.println("Employee bonuses details");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id :  ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Employee Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Salary : ");
		double salary = sc.nextDouble();
		
		EmployeeClass e1 =new EmployeeClass(id, name, salary);
		e1.Bonus();
		e1.employee();
		
		
	}
	void Bonus() {
		bonus = salary * 10/100;
		total_salary = salary + bonus;
	}
	
	void employee()
	{
		System.out.println("Employee Id is " + id);
		System.out.println("Employee Name is " + name);
		System.out.println("Employee Salary is " + salary);
		System.out.println("Employee Bonus is " + bonus);
		System.out.println("Total Salary is " + total_salary);
	}
}
