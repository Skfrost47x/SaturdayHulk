package com.upskill.assignment_1;

public class Problem_3 {

/*A function which returns the multiply value of a and b where a = 9 and b = 11.
Write a program which will display addition of a +b + function returns value. */
	
	public static void main(String[] args) {
		
		MultAdd();
		int a = 9;
		int b = 11;
		int c = MultAdd();
		System.out.println("The Addition of ab with multiplication of ab is " +(a+b+c));
	}
	public static int MultAdd() {
		int a = 9;
		int b = 11;
		int c =a*b;
		return c;
	}
	
}
