package com.thaiprogramer.ooplab;

public class Programmer extends Employee {

	public Programmer(String firstNameInput, String lastNameInput, int salaryInput, String positionInput) {
		super(firstNameInput, lastNameInput, salaryInput, positionInput);
		getSalary();
	}
	
	public void createWebsite(String template, String title) {
		System.out.println("create Website");
	}
	
	public void installWindow(String version, String productKey) {
		System.out.println("install window");
	}
	
	public void work() {
		createWebsite("A", "this is website");
		installWindow("10", "1234");
	}

}
