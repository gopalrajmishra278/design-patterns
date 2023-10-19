package com.gopal;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		AppleCharger charger = new AdpaterCharger(new GMCharger());
		
		Iphone13 Iphone13 = new Iphone13(charger);
		
		Iphone13.chargePhone();

	}

}
