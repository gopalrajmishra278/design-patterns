package com.gopal;

public class Samosa {
	
	private static Samosa samosa;
	
	//constructor
	private Samosa() {
		
	}
	
	//Lazy way of creating singleton object
	public static Samosa getSamosa() {
		//object of this class
		
		if(samosa==null) {
			
			samosa= new Samosa();
		}
		
		return samosa;
		
		
		
		
		
		
	}
	
}

/*
 * 1.constructor private
 * 
 * 2. object create with the help of method(factory method)
 * 
 * 3. create field to store object is private
 * 
 * 
 * 
 */
