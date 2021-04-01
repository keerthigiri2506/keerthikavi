package com.java.demo;

public class String_Concept {
	public static void main(String[] args) {
		String s = "The sun rises in the east";
		System.out.println(s);
		int length = s.length();
		System.out.println(length);
		char charAt = s.charAt(15);
		System.out.println(charAt);
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		String UpperCase = s.toUpperCase();
		System.out.println(UpperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		boolean equals = s.equals("The sun rises in the east");
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("The sun rises in the EAST");
		System.out.println(equalsIgnoreCase);
		boolean contains = s.contains("Sun");
		System.out.println(contains);
		boolean startsWith = s.startsWith("in the east");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("The sun rises");
		System.out.println(endsWith);
		String replace = s.replace('t', 'i');
		System.out.println(replace);
		String replace2 = s.replace("rises", "east");
		System.out.println(replace2);
		String replaceAll = s.replaceAll("The sun rises in the east", "Love you mummy");
		System.out.println(replaceAll);
		String substring = s.substring(5, 18);
		System.out.println(substring);
		
		
	}

}
