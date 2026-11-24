package com.java.oops;

class Employee implements Cloneable{
	int id;
	String name;
	Address addres;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Employee(int id, String name, Address addres) {
		this.id = id;
		this.name = name;
		this.addres = addres;
	}
}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Hyderabad");
		Employee employee = new Employee(1, "Harinadh", add);
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.addres.city);
		System.out.println("**************************");
		
		Employee e2 = (Employee)employee.clone();
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.addres.city);
		System.out.println("**************************");
		
		e2.id = 2;
		e2.name = "Rohit";
		e2.addres.city = "Mumbai";
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.addres.city);
		System.out.println("**************************");
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.addres.city); 
		
	}

}
