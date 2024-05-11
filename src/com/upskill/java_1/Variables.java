package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";
	public static String region = "North America";
	
//	Variables in Java
	
//	Instance OR global variable - Variables declared in Class level, outside method
//	Local variable - variables declared in methods 
//	Static variable - variables belong to class and don't required creating object
//	Method parameter - variables used as method parameter
	
	
	
	public static void main(String[] args) {
			ny("KINGS");
			nj("Essex", 50000);
			ct("New Haven");
			
			Variables myObj = new Variables();
			System.out.println(myObj.country);
			System.out.println(region);
	}

	public static void ny(String county){
		String city = "Queens";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}
	
	public static void nj(String county, int population){
		String city = "Bloomfield";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
		System.out.println(population);
	}
	
	public static void ct(String county){
		String city = "Hartford";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}
}

