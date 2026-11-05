package com.java.introduction;
class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Constructor Called");
    }
}
class Car extends Vehicle {
    String model;
    int price;
    Car(String brand, int speed, String model, int price) {
        super(brand, speed);
        this.model = model;
        this.price = price;
        System.out.println("Car Constructor Called");
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Car c = new Car("BMW", 250, "M4", 8500000);
        c.display();
    }
}