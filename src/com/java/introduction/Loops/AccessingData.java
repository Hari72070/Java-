package com.java.introduction.Loops;

public class AccessingData {

	public static void main(String[] args) {
		System.out.println("Accessing the data from the Employee class");
		Employee e1 = new Employee();
		e1.setId(4007);
		System.out.println("Employee Id is : " + e1.getId());
		e1.setName("Harinadh");
		System.out.println("Employee Name is : " + e1.getName());
		e1.setSalary(1000000.00);
		System.out.println("Employee Salary is : " + e1.getSalary());
		e1.setPassword("Hari@1234$#%");
		System.out.println("Employee's Password is : " + e1.getPassword());
	}

}
