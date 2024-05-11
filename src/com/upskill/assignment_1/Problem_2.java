package com.upskill.assignment_1;

public class Problem_2 {

	/*A rectangle width and length are: 9 and 13 inches.
	Write a method to display the perimeter of rectangle in console output. */

	public static void main(String[] args) {
		
		Problem_2 myObject = new Problem_2 ();
		myObject.Rectangle();
		
	}
	public void Rectangle() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
	System.out.println("The perimeter of the Rectangle is " + c);
	}
}
