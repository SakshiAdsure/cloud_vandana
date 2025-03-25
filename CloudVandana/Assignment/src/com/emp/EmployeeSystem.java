package com.emp;

import java.util.Scanner;

class Employee {
	
	private int id;
	private String name;
	
	// here generate constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//here generate setter and getter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private double salary;

	// display employee information
	public void displayDetails() {
		System.out.println("ID : " + id + ", Name: " + name + ", Salary: " + salary);
	}
}

public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of employees");
		int count=sc.nextInt();
		
		sc.nextLine();
		
		// create array of object class
		Employee[] employee= new Employee[count];
		
		for(int i=0;i<count;i++) {
			System.out.println("Enter employee ID:");
			int id=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter employee name:");
			String name=sc.nextLine();
			
			System.out.println("Enter employee salary");
			Double salary=sc.nextDouble();
			
			employee[i]=new Employee(id,name,salary);
		}
		
		// Display employee details
		System.out.println("Employee deatils : ");
		for(Employee emp: employee) {
			emp.displayDetails();
		}

	}

}
