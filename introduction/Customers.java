package com.java.introduction;

public class Customers {
	String model;
	int quantity;
	double price;
	double deliveryCharge;
	double mobileCost;
	double finalBill;

	Customers() {
		System.out.println("No arg constructor");
		this("unknown");

	}

	Customers(String model) {
		System.out.println("One arg constructor called");
		this(model, 3);
		this.model = model;
	}

	Customers(String model, int quantity) {
		this(model, quantity, 89000.00);
		this.quantity = quantity;
	}

	Customers(String model, int quantity, double price) {
		this(model, quantity, price, 475.60);
		this.price = price;

	}

	Customers(String model, int quantity, double price, double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	void calculate() {
		System.out.println(quantity * price);

	}

	public static void main(String[] args) {
		Customers customers = new Customers();
		customers.calculate();
	}
}

//.Create a Java program to calculate a customer’s Mobile Bill using constructor chaining.
//->Create multiple constructors and use "this()" to perform constructor chaining.
//->The program should calculate:
//- Mobile cost = Price × Quantity
//- Final bill = Mobile cost + Delivery charge
//->Ask the user for:
//Mobile model, Quantity, Price, and Delivery charge.
//Output
//Display mobile model, price, quantity, mobile cost, delivery charge, and final bill.
//Note: Use constructor chaining only.