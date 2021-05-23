package com.thaiprogramer.ooplab;

public class Employee {
	public String firstName;
	public String lastName;
	private int salary;
	public String position;
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("first", "last", 10000, "CEO");
		employee1.checkPosition();
	}
	
	
	public Employee(String firstNameInput, String lastNameInput, int salaryInput, String positionInput) {
		firstName = firstNameInput;
		lastName = lastNameInput;
		salary = salaryInput;
		position = positionInput;
		
	}
	
	public void hello() {
		System.out.println("Hello" + firstName);
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void checkPosition() {
		System.out.println(position);
	}
	
}
