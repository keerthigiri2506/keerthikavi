package com.javaS.demo;

public class Substraction {
	public Substraction() {
	System.out.println("Substract two numbers");
	}

	public Substraction(String s) {
		System.out.println("Entered: " +s);
			}
	public static void main(String[] args) {
		Substraction s = new Substraction();
		Substraction st = new Substraction("New Substract");
			}
}
