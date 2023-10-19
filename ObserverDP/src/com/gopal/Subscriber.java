package com.gopal;

public class Subscriber implements Observer {
	
	String name;
	
	Subscriber(String name){
		
		this.name = name;
		
	}

	@Override
	public void notified(String title) {
		
		System.out.println("Hello "+ this.name + "new tour affordable price for just Rs.1000 holy place package "+ this.name);
		
	}

}
