package com.inheritance;

interface FirstInterface {
	public void name();
	
	public void pincode();
}
public class ParentClass extends NewChild implements FirstInterface {
	public void name() {
		System.out.println("My name is Nivea");

	}
	public void pincode() {
		System.out.println("My Pincode: 600126");

	}
	
	public static void main(String[] args) {
		ParentClass ref = new ParentClass();
		ref.name();
		ref.pincode();
		ref.education();
		ref.games();
	}

}
