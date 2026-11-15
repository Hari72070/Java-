package com.java.LinkedinContent;

public class CaseStudy03 {

	public static void main(String[] args) {
		int[] salary = {25000,40000, 30000, 50000, 35000 };
		System.out.println("The salary of the given employees are : " );
		for(int i =0; i<salary.length; i++){
			System.out.print(" " + salary[i]);
		}
		int max = salary[0];
		for(int i=0; i<salary.length; i++) {
			if(salary[i] > max) {
				max = salary[i];
			}
		}
		System.out.println();
		System.out.println("The Highest salary is :" + max);
		int secmax = salary[0];
		for(int i =0; i<salary.length; i++) {
			if(salary[i] > secmax && salary[i]!= max) {
				secmax = salary[i];
			}
		}
		System.out.println("The second highest salary is : " + secmax);
		int min = salary[0];
		for(int i=0; i<salary.length; i++) {
			if(salary[i]<min) {
				min = salary[i];
			}
		}
		System.out.println("The lowest salary is : " + min);
		int count = 0;
		for(int i=0; i<salary.length; i++) {
			if(salary[i]>30000) {
				count ++;
			}
		}
		System.out.println("The count of employees earns more than 30000 is " + count);
		int final_bill = 0;
		for(int i= 0;i<salary.length; i++) {
			final_bill = final_bill + salary[i];
		}
		System.out.println("The final bill is : "+ final_bill);
		
	}
}
