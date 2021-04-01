package com.javaS.demo;

import java.util.Scanner;

public class Scanner_New {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		System.out.println("Entered: " +sentence);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("My age is " +age);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("My name is " +name);
		System.out.println("Enter your percentage");
		double percentage = sc.nextDouble();
		System.out.println("My percentage is " +percentage);
		
	}

}
