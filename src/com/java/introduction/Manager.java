package com.java.introduction;
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor Called");
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    int teamSize;
    Manager(int id, String name, double salary,String department, int teamSize) {
        super(id, name, salary);
        this.department = department;
        this.teamSize = teamSize;
        System.out.println("Manager Constructor Called");
    }
    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
    public static void main(String[] args) {
        Manager m = new Manager(101, "Harinadh", 65000,"Software Development", 8);
        System.out.println("\nManager Details:");
        m.displayManager();
    }
}