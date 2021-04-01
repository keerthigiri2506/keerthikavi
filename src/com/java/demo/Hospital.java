package com.java.demo;

public class Hospital {
public void doctor(String s) {
System.out.println("Doctor name is " +s);
}

public void doctor(String s, char c) {
System.out.println("Doctor name is " +s + " " +c);
}

public void doctor(double d) {
System.out.println("Doctor salary is " +d);
}

public static void main(String[] args) {
	Hospital h = new Hospital();
	h.doctor("Priya");
	h.doctor("Keerthi", 'A');
	h.doctor(200000);
}
}
