package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hasmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		int age = 25;										//Variable
		int[] ageHULK = new int[]{25, 30, 35, 38, 43, 37};  //Array
		
		//Array Index				[0] [1] [2] [3] [4]

		System.out.println("student age : " + ageHULK[2]);
		System.out.println("Total student : " + ageHULK.length);
		
		String[] nameHULK = new String[]{"Redwan", "Vlad", "Bashar", "Rasel", "Khalid", "SHABBIR"};
		
		System.out.println("NAME : " + nameHULK[5]);
		System.out.println("Total student : " + nameHULK.length);
		
		//Multi-Dimensional Array
		int [][] ageHULK2D = {{25, 30, 35, 40, 45, 50},
							  {23, 34, 43, 33, 48}};
		
		System.out.println("Student Age 2D : " + ageHULK2D[1][3]);
		
		// Hashmap store multiple data using key-value pair, Implementation of Map Interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Redwan", 31);
		Student.put("Bashar", 35);
		Student.put("Muazzem", 33);
		Student.put("Shourav", 26);
		Student.put("Khalid", 33);
		Student.put("Shabbir", 29);
		
		System.out.println("HashMap student Age : " + Student.get("Shabbir"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		
		Country.put("Bangladesh", "Dhaka");
		Country.put("India", "Delhi");
		Country.put("Pakistan", "Islamabad");
		Country.put("Afganisthan", "Kabul");
		Country.put("Russia", "Moscow");
		Country.put("United States", "Washington DC");
		
		System.out.println("HashMap Capital : " + Country.get("United States"));
		
		
		HashMap<String, String> Region = new HashMap<String, String>();
		
		Region.put("Bangladesh", "Asia");
		Region.put("India", "Asia");
		
		Region.put("England", "Europe");
	
		Region.put("United States", "Washington DC");
		
    	System.out.println("HashMap Region : " + Region.get("England"));
    	//HashTable store multiple data using key-value pair, No Duplicate, also is Synchronized (only one thread can be modified)
    	
    	
	HashSet<String> car = new HashSet<String>();
	car.add("Audi");
	car.add("BMW");
	car.add("BMW");
	car.add("Tesla");
	car.add("Range Rover");
	car.add("Honda");
	System.out.println("Car : " + car);
	
	}
}
