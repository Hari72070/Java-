package com.java.introduction;
public class ExpensiveCars {
    String carName;
    String country;
    double price;
    int horsepower;
    ExpensiveCars() {
        System.out.println("No-argument constructor called");
        carName = "Pagani Huayra";
        country = "Italy";
        price = 3.50;
        horsepower = 730;
    }
    ExpensiveCars(String carName, String country, double price, int horsepower) {
        System.out.println("Parameterized constructor called");
        this.carName = carName;
        this.country = country;
        this.price = price;
        this.horsepower = horsepower;
    }
    void display() {
        System.out.println("Car Name: " + carName);
        System.out.println("Country: " + country);
        System.out.println("Price: $" + price + " Million");
        System.out.println("Horsepower: " + horsepower + " HP");
    }
    public static void main(String[] args) {
        ExpensiveCars car1 = new ExpensiveCars();
        car1.display();
        System.out.println("--------------------");
        ExpensiveCars car2 = new ExpensiveCars("Ferrari F40", "Italy", 7.00, 471);
        car2.display();
    }
}