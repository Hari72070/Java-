package com.java.introduction.Loops;
class Student {
    int id;
    String name;
    // No-argument constructor
    Student() {
        id = 101;
        name = "Harinadh";
        System.out.println("No-Argument Constructor Called");
    }
    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
public class ConstructorRules {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        System.out.println();
        Student s2 = new Student(102, "Rahul");
        s2.display();
    }
}