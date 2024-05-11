package com.upskill.assignment_2;

public class Problem_6 {

	public static boolean isPrime(int num) {
		int i;
		if (num<=1){
			return false;
		}
		for (i=2; i<=Math.sqrt(num); i++){
			if(num%i ==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Prime number between 1 and 100 :");
		
		for(int i = 1; i<=100; i++){
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
