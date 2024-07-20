package com.scannerEx;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int nextInt =s.nextInt();
		System.out.println(nextInt);
		
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		
		String next = s.next();
		System.out.println(next);
		
		char charAt = s.next().charAt(7);
		System.out.println(charAt);
		
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		
		int nextInt2 = s.nextInt();
		int nextInt3 = s.nextInt();
		System.out.println(nextInt * nextInt2);
	}

}
