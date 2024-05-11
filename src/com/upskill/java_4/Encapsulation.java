package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	
	private String name = "UpSkill";			// Write & Read
	private int SSN = 7422247;					// Write only
	private String username = "SKFrost";		// Read only
			
	//Setter Method - name				//set the data, Write
	public void setName(String value) {
		name = value;
		
	}

	//Getter Method						//get the data, Read
	public String getName() {
		return name;
	}
	
	//Setter Method - SSN				//Set the data, write
	public void setSSN(int value){
		SSN = value;
	}
	
	//Getter Method - username 			//get the data, read
	public String getUsername(){
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Muazzem601");
		
		System.out.println(obj.getName());
		
		obj.setSSN(9999999);
		
		System.out.println(obj.getUsername());
	}
}
