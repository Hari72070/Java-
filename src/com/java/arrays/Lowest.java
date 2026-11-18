package com.java.arrays;

public class Lowest {

	public static void main(String[] args) {
		int[] prices = {7,1,5,6,4,3};
		int minPrice = Integer.MAX_VALUE; 
		int maxProfit = 0; 

		for(int price : prices){
			if(price < minPrice){
				minPrice = price;
			}
			if(price-minPrice > maxProfit){
				maxProfit = price - minPrice;
			}
		}
		System.out.println("Maximum Profit: " + maxProfit);
	}
}
