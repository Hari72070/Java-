package com.java.casestudiess;

public class Laptop extends Device{
	String ram;
	String processor;
	
	public void runIDE() {
		System.out.println("Running IDE is : ");
	}
	public void compileCode() {
		System.out.println("The Code is compiling using compiler!!");
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("RAM : " + ram);
		System.out.println("Processor : " + processor);
	}
}
