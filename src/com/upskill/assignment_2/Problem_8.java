package com.upskill.assignment_2;

public class Problem_8 {
	/* Problem8. Write Java Program to display Factorial of Number 7. */
	
	public static void main(String[] args) {
		
		int n = 7;
		int result = 1;
		int i;
		for (i = 1; i <= n; i++){
			result = result * i;
		}
		
		System.out.println("The factorial of 7 is :" +result);

	}

}
