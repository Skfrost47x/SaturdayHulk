package com.upskill.java_2;

public class Loops {
/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */
	public static void main(String[] args) {
//		practiceForLoops();
//		practiceWhileLoops();
//		practiceDoWhileLoops();
//		practiceinfiniteLoops();
		practiceNestedForLoops();
	}
	

	public static void practiceForLoops(){					//For Loop - Do again and again up to upper limit
		int i;                                 			 	//Initialize the variable
		for (i=1; i<=10; i++){                    			//Setting upper limit, lower limit, increment and decrement
			System.out.println("For Loops Number = " + i);  //Statement
		}
	}	
		public static void practiceWhileLoops(){					//while Loop - Do again and again up to condition match
			int i = 1;                                 			 	//Initialize the variable
			while (i<=10){                    						//Setting condition
				System.out.println("while Loops Number = " + i);    //Statement
				i++;                    							//Increment or Decrement
			}
		}	
		public static void practiceDoWhileLoops(){					//DO while Loop - Do action then match condition
			int i = 1;                                 			 	//Initialize the variable
			do {                    								
				System.out.println("Do while Loops Number = " + i); //Statement
				i++;                    							//Increment or Decrement
			} while (i<=10);										//Checking condition
		}
		public static void practiceinfiniteLoops(){					//infinite Loop - never ending loop
			int i;                                 			 	    //Initialize the variable
			for(i=1; ; i++) {                    					//Setting no upper limit			
				System.out.println("Do while Loops Number = " + i); //Statement
				                    							
			} 										
		}
		public static void practiceNestedForLoops(){			    //Nested Loop - loop inside another loop
			int i;													//initialize i for loop 1
			int j;													//initialize j for loop 2
			for(i=1; i<=10; i++){									//first loop for i
				for(j=1; j<=10; j++){								//second loop for j
					int multiplicationtable = i * j;				//statement for loop 2
					System.out.print(multiplicationtable + " ");			
				}
				System.out.println(" "); 
				                    							
			} 										
		}
}
