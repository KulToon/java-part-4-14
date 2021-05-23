package com.thaiprogramer.ooplab;

public class Ceo extends Employee {
	public Ceo(String firstNameInput, String lastNameInput, int salaryInput, String positionInput) {
		super(firstNameInput, lastNameInput, salaryInput, positionInput);
	}
	
	public int getSalary() {
		return super.getSalary() * 2;
	}
	
	public void hire(int saraly) {
		System.out.println(saraly);
	}
	
	public void work() {
		hire(1000);
	}
	
}
