package com.gopal;

public class Jalebi {
	
	//Eager way of creating singleton object
	public static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		
	    	return jalebi;
		
	}
	
}
