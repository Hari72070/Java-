package com.java.introduction.Loops;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("======= Welcome to the Yeagerist Restaurant =======");

		System.out.println("====== Menu ======");
		System.out.println("Click 1 for Pizzas");
		System.out.println("Click 2 for Burgers");
		System.out.println("Click 3 for Biryanis");
		System.out.println("Click 4 for Noodles");

		Scanner sc = new Scanner(System.in);

		int total_price = 0;
		int ord = sc.nextInt();
		String y;
		do {
			switch (ord) {
			case 1 -> {
				System.out.println("Please select the pizza you want to order");
				int pizz = sc.nextInt();
				int pizza_price = 0;
				String yn;
				do {
					int quantity = 0;

					switch (pizz) {
					case 1 -> {
						int volc_price = 199;
						System.out.println("You selected Volcano Pizza!!");
						System.out.println("Volcano pizza price is " + volc_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						pizza_price += volc_price * quantity;
						total_price += volc_price * quantity;
					}
					case 2 -> {
						int chic_price = 299;
						System.out.println("You selected Chicken Pizza!!");
						System.out.println("Chicken pizza price is " + chic_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						pizza_price += chic_price * quantity;
						total_price += chic_price * quantity;
					}
					case 3 -> {
						int pann_price = 159;
						System.out.println("You selected Panner Pizza!!");
						System.out.println("Panner pizza price is " + pann_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						pizza_price += pann_price * quantity;
						total_price += pann_price * quantity;
					}
					default -> {
						System.out.println("selected Pizza not availabe!!");
					}
					}
					System.out.println("Do you want to continue with another pizza!! Click y for yes n for no");
					yn = sc.next();
					if (yn.equalsIgnoreCase("y")) {
						System.out.println("Select another pizza:");
						pizz = sc.nextInt();
					} else {
						System.out.println("Your total Pizza price is : " + pizza_price + "/-");
					}

				} while (yn.equalsIgnoreCase("y"));
			}
			case 2 -> {
				System.out.println("Please select the Burgers you want to order");
				int bugg = sc.nextInt();
				int burger_price = 0;
				String yn;
				do {
					int quantity = 0;

					switch (bugg) {
					case 1 -> {
						int vegbur_price = 99;
						System.out.println("You selected Veg Burger!!");
						System.out.println("Veg Burger price is :" + vegbur_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						burger_price += vegbur_price * quantity;
						total_price += vegbur_price * quantity;

					}
					case 2 -> {
						int chickbur_price = 199;
						System.out.println("You selected Chicken Burger!!");
						System.out.println("Chicken Burger price is :" + chickbur_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						burger_price += chickbur_price * quantity;
						total_price += chickbur_price * quantity;
					}
					case 3 -> {
						int chesbur_price = 149;
						System.out.println("You selected Cheese Burger!!");
						System.out.println("Cheese Burger price is : " + chesbur_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						burger_price += chesbur_price * quantity;
						total_price += chesbur_price * quantity;
					}
					default -> {
						System.out.println("Selected Burger not available!!");
					}
					}
					System.out.println("Do you want to continue with another burger!! Click y for yes n for no");
					yn = sc.next();
					if (yn.equalsIgnoreCase("y")) {
						System.out.println("Select another burger");
						bugg = sc.nextInt();
					} else {
						System.out.println("Your total Pizza price is : " + burger_price + "/-");
					}
				} while (yn.equalsIgnoreCase("y"));

			}
			case 3 -> {
				System.out.println("Select the Biryanis you want to order");
				int bir = sc.nextInt();
				int biryani_price = 0;
				String yn;
				do {
					int quantity = 0;
					switch (bir) {
					case 1 -> {
						int chicbr_price = 259;
						System.out.println("You selected Chicken Biryani!!");
						System.out.println("Chicken Biryani price is " + chicbr_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						biryani_price += chicbr_price * quantity;
						total_price += chicbr_price * quantity;

					}
					case 2 -> {
						int mutrbr_price = 359;
						System.out.println("You selected Mutton Biryani!!");
						System.out.println("Mutton Biryani price is  " + mutrbr_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						biryani_price += mutrbr_price * quantity;
						total_price += mutrbr_price * quantity;
					}
					case 3 -> {
						int vegbr_price = 199;
						System.out.println("You selected Veg Biryani!!");
						System.out.println("Veg Biryani price is " + vegbr_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();
						biryani_price += vegbr_price * quantity;
						total_price += vegbr_price * quantity;
					}
					default -> {
						System.out.println("Selected Biryani not available!!");
					}
					}
					System.out.println("Do you want to continue with any other biryanis!! Click y for yes n for no");
					yn = sc.next();
					if (yn.equalsIgnoreCase("y")) {
						System.out.println("Select another Biryani!!");
						bir = sc.nextInt();
					} else {
						System.out.println("Your total Biryani price is : " + biryani_price + "/-");
					}
				} while (yn.equalsIgnoreCase("y"));
			}

			case 4 -> {

				System.out.println("Select the Noodles you want to order");

				int nood = sc.nextInt();
				int noodles_price = 0;
				String yn;

				do {

					int quantity = 0;

					switch (nood) {

					case 1 -> {
						int vegnood_price = 89;

						System.out.println("You selected Veg Hakka Noodles!!");
						System.out.println("Veg Hakka Noodles price is " + vegnood_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();

						noodles_price += vegnood_price * quantity;
						total_price += vegnood_price * quantity;
					}

					case 2 -> {
						int chicnood_price = 199;

						System.out.println("You selected Chicken Noodles!!");
						System.out.println("Chicken Noodles price is " + chicnood_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();

						noodles_price += chicnood_price * quantity;
						total_price += chicnood_price * quantity;
					}

					case 3 -> {
						int eggnood_price = 139;

						System.out.println("You selected Egg Noodles!!");
						System.out.println("Egg Noodles price is " + eggnood_price + "/-");
						System.out.println("Enter your quantity");

						quantity = sc.nextInt();

						noodles_price += eggnood_price * quantity;
						total_price += eggnood_price * quantity;
					}

					default -> {
						System.out.println("Selected Noodles not available!!");
					}
					}

					System.out.println("Do you want to continue with other noodles items!! Click y for yes n for no");

					yn = sc.next();

					if (yn.equalsIgnoreCase("y")) {

						System.out.println("Select another Noodles!!");
						nood = sc.nextInt();

					} else {

						System.out.println("Your total Noodles price is: " + noodles_price + "/-");
					}

				} while (yn.equalsIgnoreCase("y"));
			}

			}
			System.out.println("Do you want to add any item!!");
			y = sc.next();
			if (y.equalsIgnoreCase("y")) {

			    System.out.println("====== Menu ======");
			    System.out.println("Click 1 for Pizzas");
			    System.out.println("Click 2 for Burgers");
			    System.out.println("Click 3 for Biryanis");
			    System.out.println("Click 4 for Noodles");

			    System.out.println("Select another category:");

			    ord = sc.nextInt();
			}else {
				System.out.println("Total price: " + total_price + "/-");
			}
		} while (y.equalsIgnoreCase("y"));
	}

}

//2.Create a Java program for a Food Ordering System using switch-case.
//Requirements:
//Display the following menu:
//1 → Pizza – ₹200
//2 → Burger – ₹120
//3 → Biryani – ₹180
//4 → Noodles – ₹100
//Ask the user to select an item and enter the quantity.
//Calculate the total bill = item price × quantity.
//Output:
//Display the selected item, price, quantity, and total bill.