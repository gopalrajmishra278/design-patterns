package com.gopal;

public class Test {

	public static void main(String[] args) {
	
		IRCTC channel  = new IRCTC();
		
		Subscriber gopal = new Subscriber("Gopal");
		Subscriber amit = new Subscriber("Amit");
		
		channel.subscribe(gopal);
		channel.subscribe(amit);
		
		channel.unsubscribe(gopal);
		channel.unsubscribe(amit);
		
		channel.notifyChanges("New Tour Package for Visnu Devi");
		channel.notifyChanges("New Tour Package for Twleve Jotriling");
		
		
		

	}

}
