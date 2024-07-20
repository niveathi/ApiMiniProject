package com.firstday;

import com.accessSpecifier.Class2;
import com.accessSpecifier.Specifiers;

public class First extends Specifiers {
	
//	private void addition() {
//		System.out.println("Hi");
//		System.out.println("Have a nice day");
//		
//	}
//	private void multiplication() {
//		System.out.println("100");
//	}
//	public static void main(String[] args) {
//		First j=new First();
//		j.addition();
//		j.multiplication();
//	}
	
	@Override
	protected void protectedAccess() {
		// TODO Auto-generated method stub
		super.protectedAccess();
	}
	@Override
		public void publicAccess() {
			// TODO Auto-generated method stub
			super.publicAccess();
		}
	
	public static void main(String[] args) {
		First j=new First();
		j.protectedAccess();
		j.publicAccess();
		
		
		Specifiers s=new Specifiers();
		s.publicAccess();
		
		
	}
	}
