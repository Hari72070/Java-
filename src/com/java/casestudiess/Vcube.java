package com.java.casestudiess;

public class Vcube {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setBrand("MSI Titan 18 HX");
		l.setPrice(677990.00);
		
		
		l.ram  = "64GB ";
		l.processor = "Intel Core Ultra 9 processor";
		l.displayDetails();
		l.runIDE();
		l.compileCode();
		
		Mobile m = new  Mobile();
		m.setBrand("Samsung Galaxy S26 Ultra");
		m.setPrice(149999.00);
		
		m.battery = "6000 mAh";
		m.camera = "200 MP";
		
		m.displayDetails();
		m.makeCall();
		m.takePhoto();
	}

}
