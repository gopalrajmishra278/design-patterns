package com.gopal;

public class AdpaterCharger implements AppleCharger {
	
	private AndroidCharger charger;
	
	
    public AdpaterCharger(AndroidCharger charger) {
		
		this.charger = charger;
	}



	@Override
	public void chargePhone() {
		
		charger.chargerAndroidPhone();
		System.out.println("Your phone is charging with adpater");
		
		
	}
	
}
