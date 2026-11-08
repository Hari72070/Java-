
package com.java.introduction;

import java.util.Scanner;

public class CaseStudy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Pullati's Super Market!!");

        int quantity;
        int total = 0;
        int cost;
        double discount = 0;
        double finalAmount;
        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Apply Discount");
            System.out.println("4. Final Amount");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {

                    System.out.println("How many products do you want to add?");
                    int records = sc.nextInt();

                    for (int i = 1; i <= records; i++) {

                        sc.nextLine(); // Clear newline

                        System.out.println("Enter product name:");
                        String productName = sc.nextLine();

                        System.out.println("Enter quantity:");
                        quantity = sc.nextInt();

                        System.out.println("Enter cost:");
                        cost = sc.nextInt();

                        int productBill = bill(quantity, cost);

                        total = total + productBill;

                        System.out.println(productName + " Bill: " + productBill);
                    }
                }
                case 2 -> {
                    System.out.println("Total Bill: " + total);
                }

                case 3 -> {

                    if (total >= 10000) {
                        discount = total * 0.15;
                        System.out.println("Discount: " + discount);
                    } else {
                        discount = 0;
                        System.out.println("No discount available.");
                    }
                }

                case 4 -> {

                    finalAmount = total - discount;

                    System.out.println("Total Bill: " + total);
                    System.out.println("Discount: " + discount);
                    System.out.println("Final Amount: " + finalAmount);
                }

                case 5 -> {
                    System.out.println("Thank you for shopping!");
                }

                default -> {
                    System.out.println("Invalid Choice!!");
                }
            }

        } while (choice != 5);

        sc.close();
    }

    static int bill(int quantity, int cost) {

        int bill = quantity * cost;

        return bill;
    }
}

//Online shopping CartSupermarket Management System Develop a java application for supermarket
// Menu should display : 
//add product 
// calculate bill
// apply disount
// final amount
// exit

//conditions ->
// use switch case
// use while loop to repeat the menu
// use for loop to accept multiple records
// calculate total price
// apply 15% discount if total exceeds 10,000/-
// display the final bill