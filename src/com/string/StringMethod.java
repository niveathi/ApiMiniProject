package com.string;

public class StringMethod {
	public static void main(String[] args) {
		String s="Java by James Gosling";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("Java by James Gosling");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Java by James Gosling");
		System.out.println(equalsIgnoreCase);
	
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
	
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
	
		boolean startswith = s.startsWith("Java");
		System.out.println(startswith);
		
		boolean endswith = s.endsWith("g");
		System.out.println(endswith);
		
		boolean contains = s.contains("J");
		System.out.println(contains);
		
		int indexOf = s.indexOf("y");
		System.out.println(indexOf);
		
		int lastindexOf = s.lastIndexOf("a");
		System.out.println(lastindexOf);
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		String replace = s.replace("Java", "Selenium");
			System.out.println(replace);
			
		String substring = s.substring(5);
		System.out.println(substring);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		System.out.println(s);
		
		String trim = s.trim();
		System.out.println(trim);
		
		String concat = s.concat(" Selenium");
		System.out.println(concat);
		
		String s1="java selenium";
		String[] words = s1.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
	
	}

}
