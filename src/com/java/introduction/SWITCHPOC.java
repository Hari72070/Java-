package com.java.introduction;
import java.util.Scanner;
public class SWITCHPOC {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoryChoice;
        double grandTotal = 0;
        do {
            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("Soups");
            System.out.println("Veg Starters");
            System.out.println("Non Veg Starters");
            System.out.println("Veg Main Course");
            System.out.println("Non-Veg Main Course");
            System.out.println("Mock Tails");
            System.out.println("Desserts");
            System.out.println("Enter the category:");
            String item = sc.nextLine();
            switch (item) {
            case "Soups" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Soup you want to order:");
                    int quantity = 0;
                    double soup_price = 0;
                    String si = sc.nextLine();
                    switch (si) {
                    case "TomatoSoup" -> {
                        soup_price = 80;
                        System.out.println("Tomato Soup - Rs. 80");
                    }
                    case "SweetCornSoup" -> {
                        soup_price = 100;
                        System.out.println("Sweet Corn Soup - Rs. 100");
                    }
                    case "HotAndSourSoup" -> {
                        soup_price = 120;
                        System.out.println("Hot and Sour Soup - Rs. 120");
                    }
                    case "ManchowSoup" -> {
                        soup_price = 110;
                        System.out.println("Manchow Soup - Rs. 110");
                    }
                    case "MushroomSoup" -> {
                        soup_price = 130;
                        System.out.println("Mushroom Soup - Rs. 130");
                    }
                    case "ChickenSoup" -> {
                        soup_price = 250;
                        System.out.println("Chicken Soup - Rs. 250");
                    }
                    case "MuttonSoup" -> {
                        soup_price = 299;
                        System.out.println("Mutton Soup - Rs. 299");
                    }
                    default -> System.out.println("Soup not available!");
                    }
                    if (soup_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = soup_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + soup_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another soup? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Soups bill: Rs. " + total);
                grandTotal += total;
            }
            case "Veg Starters" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double veg_price = 0;
                    String vi = sc.nextLine();
                    switch (vi) {
                    case "PaneerTikka" -> {
                        veg_price = 220;
                        System.out.println("Paneer Tikka - Rs. 220");
                    }
                    case "VegManchurian" -> {
                        veg_price = 180;
                        System.out.println("Veg Manchurian - Rs. 180");
                    }
                    case "Gobi65" -> {
                        veg_price = 160;
                        System.out.println("Gobi 65 - Rs. 160");
                    }
                    case "SpringRolls" -> {
                        veg_price = 150;
                        System.out.println("Spring Rolls - Rs. 150");
                    }
                    case "CrispyCorn" -> {
                        veg_price = 190;
                        System.out.println("Crispy Corn - Rs. 190");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (veg_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = veg_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + veg_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Veg Starters bill: Rs. " + total);
                grandTotal += total;
            }
            case "Non Veg Starters" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double nonveg_price = 0;
                    String nvi = sc.nextLine();
                    switch (nvi) {
                    case "Chicken65" -> {
                        nonveg_price = 220;
                        System.out.println("Chicken 65 - Rs. 220");
                    }
                    case "ChilliChicken" -> {
                        nonveg_price = 250;
                        System.out.println("Chilli Chicken - Rs. 250");
                    }
                    case "ChickenTikka" -> {
                        nonveg_price = 280;
                        System.out.println("Chicken Tikka - Rs. 280");
                    }
                    case "ChickenLollipop" -> {
                        nonveg_price = 260;
                        System.out.println("Chicken Lollipop - Rs. 260");
                    }
                    case "ApolloFish" -> {
                        nonveg_price = 300;
                        System.out.println("Apollo Fish - Rs. 300");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (nonveg_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = nonveg_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + nonveg_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Non Veg Starters bill: Rs. " + total);
                grandTotal += total;
            }
            case "Veg Main Course" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double vegmain_price = 0;
                    String vm = sc.nextLine();
                    switch (vm) {
                    case "VegBiryani" -> {
                        vegmain_price = 200;
                        System.out.println("Veg Biryani - Rs. 200");
                    }
                    case "PaneerButterMasala" -> {
                        vegmain_price = 240;
                        System.out.println("Paneer Butter Masala - Rs. 240");
                    }
                    case "VegFriedRice" -> {
                        vegmain_price = 180;
                        System.out.println("Veg Fried Rice - Rs. 180");
                    }
                    case "DalTadka" -> {
                        vegmain_price = 160;
                        System.out.println("Dal Tadka - Rs. 160");
                    }
                    case "MushroomMasala" -> {
                        vegmain_price = 220;
                        System.out.println("Mushroom Masala - Rs. 220");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (vegmain_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = vegmain_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + vegmain_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Veg Main Course bill: Rs. " + total);
                grandTotal += total;
            }
            case "Non-Veg Main Course" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double nonvegmain_price = 0;
                    String nvm = sc.nextLine();
                    switch (nvm) {
                    case "ChickenBiryani" -> {
                        nonvegmain_price = 280;
                        System.out.println("Chicken Biryani - Rs. 280");
                    }
                    case "MuttonBiryani" -> {
                        nonvegmain_price = 350;
                        System.out.println("Mutton Biryani - Rs. 350");
                    }
                    case "ButterChicken" -> {
                        nonvegmain_price = 320;
                        System.out.println("Butter Chicken - Rs. 320");
                    }
                    case "ChickenFriedRice" -> {
                        nonvegmain_price = 230;
                        System.out.println("Chicken Fried Rice - Rs. 230");
                    }
                    case "PrawnsBiryani" -> {
                        nonvegmain_price = 330;
                        System.out.println("Prawns Biryani - Rs. 330");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (nonvegmain_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = nonvegmain_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + nonvegmain_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Non-Veg Main Course bill: Rs. " + total);
                grandTotal += total;
            }
            case "Mock Tails" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double mocktail_price = 0;
                    String mi = sc.nextLine();
                    switch (mi) {
                    case "Mojito" -> {
                        mocktail_price = 120;
                        System.out.println("Virgin Mojito - Rs. 120");
                    }
                    case "Thumbsup" -> {
                        mocktail_price = 45;
                        System.out.println("Thumbsup- Rs. 45");
                    }
                    case "BlueLagoon" -> {
                        mocktail_price = 150;
                        System.out.println("Blue Lagoon - Rs. 150");
                    }
                    case "Fruit" -> {
                        mocktail_price = 130;
                        System.out.println("Fruit Punch - Rs. 130");
                    }
                    case "Water" -> {
                        mocktail_price = 100;
                        System.out.println("Watermelon Juice - Rs. 100");
                    }
                    case "Pine" -> {
                        mocktail_price = 110;
                        System.out.println("Pineapple Juice - Rs. 110");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (mocktail_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = mocktail_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + mocktail_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Mock Tails bill: Rs. " + total);
                grandTotal += total;
            }
            case "Desserts" -> {
                String yn;
                double total = 0;
                do {
                    System.out.println("Enter the Item you want to order:");
                    int quantity = 0;
                    double dessert_price = 0;
                    String di = sc.nextLine();
                    switch (di) {
                    case "IceCream" -> {
                        dessert_price = 80;
                        System.out.println("Ice Cream - Rs. 80");
                    }
                    case "Gulab" -> {
                        dessert_price = 70;
                        System.out.println("Gulab Jamun - Rs. 70");
                    }
                    case "Brownie" -> {
                        dessert_price = 150;
                        System.out.println("Brownie - Rs. 150");
                    }
                    case "Chocake" -> {
                        dessert_price = 180;
                        System.out.println("Chocolate Cake - Rs. 180");
                    }
                    case "Ras" -> {
                        dessert_price = 100;
                        System.out.println("Rasmalai - Rs. 100");
                    }
                    default -> System.out.println("Item not available!");
                    }
                    if (dessert_price > 0) {
                        System.out.println("Enter the quantity:");
                        quantity = Integer.parseInt(sc.nextLine());
                        double itemTotal = dessert_price * quantity;
                        total += itemTotal;
                        System.out.println("Price per item: Rs. " + dessert_price);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Item total: Rs. " + itemTotal);
                    }
                    System.out.println("Do you want to order another item? (y/n)");
                    yn = sc.nextLine();
                } while (yn.equalsIgnoreCase("y"));
                System.out.println("Desserts bill: Rs. " + total);
                grandTotal += total;
            }
            default -> System.out.println("Invalid category!");
            }
            System.out.println("Do you want to continue with another category? (y/n)");
            categoryChoice = sc.nextLine();
        } while (categoryChoice.equalsIgnoreCase("y"));
        System.out.println("\n===== FINAL RESTAURANT BILL =====");
        System.out.println("Grand Total: Rs. " + grandTotal);
        System.out.println("Thank you for visiting our restaurant!");
    }
}
