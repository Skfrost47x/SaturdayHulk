package com.upskill.assignment_1;

public class Problem_4 {
/*A function returns 30, another function returns 50. 
Write a java program which will display subtraction value from bigger number to smaller.*/

	public static void main(String[] args) {
		
		Func30();
		Func50();
		int a = Func30();
		int b = Func50();
		System.out.println("The Substraction is " + (b-a));
		
	}
	public static int Func30() {
		return 30;
	}
	public static int Func50() {
		return 50;
	}
}
