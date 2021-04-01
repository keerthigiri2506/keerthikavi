package com.java.demo;

public class Loan implements Hdfc_Loan{

	@Override
	public void educationLoan() {
		System.out.println("Education Loan is 20%");
		
	}

	@Override
	public void marriageLoan() {
System.out.println("Marriage Loan is 15%");
		
	}
	
	public static void main(String[] args) {
		Loan l = new Loan();
		l.educationLoan();
		l.marriageLoan();
	}

}
