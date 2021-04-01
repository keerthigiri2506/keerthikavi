package com.java.demo;

public class School_Examcont implements School_Exam{

	@Override
	public void Physics() {
	System.out.println("Physics percentage is 80%");
			}

	@Override
	public void chemistry() {
		System.out.println("Chemistry percentage is 50%");
			}
	
	public static void main(String[] args) {
		School_Examcont sc = new School_Examcont();
		sc.Physics();
		sc.chemistry();
	}

}
