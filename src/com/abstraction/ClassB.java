package com.abstraction;

public class ClassB extends ClassA {

	@Override
	public void homeLoan() {
		System.out.println("7%");
	}

	@Override
	public void personalLoan() {
		System.out.println("8%");
	}
	
	public void educationLoan() {
		super.educationLoan();
	}
public static void main(String[] args) {
	ClassB c=new ClassB();
	c.homeLoan();
	c.personalLoan();
	c.educationLoan();
}
}
