package com.upskill.assignment_2;

public class Problem_5 {
/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/
	
	public static void main(String[] args) {
		
		int i;
		int j;
		
		for (i=1; i<=8; i++){
			for (j=1; j<=8; j++){
				int MultiplicationTable = i*j;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("---->");
		}

	}

}
