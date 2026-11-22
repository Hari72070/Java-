package com.java.casestudiess;

public class Device {
	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("The Brand of the device is  : " + brand);
		System.out.println("The Price of the device is : " + price);
	}

}
