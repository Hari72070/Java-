package com.java.introduction;
import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		System.out.println("Working with methods!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int radius = sc.nextInt();
		double result = areaofCircle(radius);
		System.out.println("The area of circle is  " + result);
		System.out.println("Enter the base of triangle : ");
		int base = sc.nextInt();
		System.out.println("Enter the height of triangle : ");
		int height = sc.nextInt();
		double triresult = areaofTriangle(base, height);
		System.out.println("The area of triangle is  " + triresult);
		System.out.println("Enter the side of square : ");
		int side = sc.nextInt();
		double sqrresult = areaofSquare(side);
		System.out.println("The area of square is  " + sqrresult);		
	}
	static double areaofCircle(int radius) {
		double area = Math.PI * radius * radius;
		return area ;
	}
	static double areaofTriangle(int base, int height) {
		double area = 0.5 * base * height;
		return area;
	}
	static double areaofSquare(int side) {
		double area = side * side;
		return area;
	}
}
