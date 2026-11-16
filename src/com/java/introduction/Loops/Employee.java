package com.java.introduction.Loops;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String password;
	public static void main(String[] args) {
		
		System.out.println("Accessing the private data");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

//1.Create an encapsulated class Employee with private fields: id, name, salary, password.
//Requirements:
//I. Make all fields private (Data Hiding).
//II. Create public setters and getters.
//III. Access and modify the data
