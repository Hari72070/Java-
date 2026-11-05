package com.java.introduction;

import java.util.Scanner;

public class Customers {
    String model;int quantity;
    double price, mobileCost, finalBill;
    Customers() {
        this("Unknown", 0);
    }
    Customers(String model) {
        this(model, 0);
    }
    Customers(String model, int quantity) {
        this(model, quantity, 0);
    }
    Customers(String model, int quantity, double price) {
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        mobileCost = price * quantity;
        finalBill = mobileCost ;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Mobile Cost: " + mobileCost);
        System.out.println("Final Bill: " + finalBill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        Customers c = new Customers(model, quantity, price);
        c.display();
    }
}