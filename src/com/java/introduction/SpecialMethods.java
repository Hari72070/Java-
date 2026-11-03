package com.java.introduction;
abstract class Animal {
	abstract void sound();
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
class Player {
	final void displayPlayer() {
		System.out.println("Player details");
	}
	synchronized void updateScore() {
		System.out.println("Updating score...");
	}
}
class Calculator {
	strictfp double calculate() {
		return 10.0 / 3.0;
	}
}
class NativeDemo {
	native void displayMessage();
}
public class SpecialMethods {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Player p = new Player();
		p.displayPlayer();
		p.updateScore();
		Calculator c = new Calculator();
		System.out.println(c.calculate());
		System.out.println("Special methods demonstration");
	}
}