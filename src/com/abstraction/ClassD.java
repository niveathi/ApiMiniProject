package com.abstraction;

public class ClassD implements InterC{

	@Override
	public void carLoan() {
		System.out.println("10%");
	}
	public static void main(String[] args) {
		ClassD c=new ClassD();
		c.carLoan();
		c.bikeLoan();
	}
	public void bikeLoan() {
		System.out.println("8%");
	}
}
