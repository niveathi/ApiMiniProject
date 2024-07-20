package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a=10;
		Set<Integer> s=new TreeSet<Integer>();
		Scanner sc= new Scanner(System.in);
		try {
//			System.out.println(a/0);
//			s.add(10);
//			s.add(null);
//			System.out.println(s);
			int nextInt=sc.nextInt();
			System.out.println(nextInt);
		} 
		catch (NullPointerException e) {
			System.out.println("Nullpointer");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		}
		
		catch (InputMismatchException e) {
			System.out.println("InputMismatch");
		}
		
		finally {
			System.out.println("Final Value");
		}
	} 

}
