package com.java.LinkedinContent;
abstract class Example {
    abstract void show();
    
    static int count = 10;
    final int number = 100;
    volatile boolean status = true;
    transient String password = "Java123";
    static {
        System.out.println("Static block executed");
    }
    synchronized void display() {
        System.out.println("Synchronized method");
    }
}
public class NonAccessModifiers extends Example {
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
    public static void main(String[] args) {
        NonAccessModifiers obj = new NonAccessModifiers();

        System.out.println("Static variable: " + count);
        System.out.println("Final variable: " + obj.number);
        System.out.println("Volatile variable: " + obj.status);
        System.out.println("Transient variable: " + obj.password);
        obj.display();
        obj.show();
    }
}