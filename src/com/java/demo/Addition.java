package com.java.demo;

public class Addition {
	public Addition() {
	System.out.println("Default Constructor");
	}
	
	public Addition(String s){
		System.out.println("Entered: " +s);
	}
	public static void main(String[] args) {
		Addition ad = new Addition();
		Addition a = new Addition("Parametrized Constructor");
		
	}
}