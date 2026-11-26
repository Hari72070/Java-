package com.java.tasks;

//Write java program for product of array except self element of array 
//Eg: arr={1,2,3,4,5}
//Output : {120,60,40,30,24}

public class ProductElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("The Product of the elements are : ");
		for (int i = 0; i < arr.length; i++) {
			int prod = 1;

			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					prod = arr[j] * prod;
				}
			}
			System.out.println(prod);
		}

	}

}
