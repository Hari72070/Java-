package com.java.casestudiess;

public class Mobile extends Device {
	
	String camera; 
	String battery;
	
	public void makeCall() {
		System.out.println("Making a call : " + getBrand());
	}
	public void takePhoto() {
		System.out.println("Taking a photo with : " + getBrand());
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		
		System.out.println("Camera Specifications is  : " + camera);
		System.out.println("Battery Capacity is : " + battery);
	}
}
