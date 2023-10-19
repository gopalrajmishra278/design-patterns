package com.gopal;
import java.util.ArrayList;
import java.util.List;

 class IRCTC implements Subject {
	
	List<Observer> subscriber = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		
		this.subscribe(ob);
		
		
	}

	@Override
	public void unsubscribe(Observer ob) {
		
		this.unsubscribe(ob);
	}

	@Override
	public void notifyChanges(String title) {
		
		for(Observer ob: this.subscriber) {
			
			ob.notified(title);
		}
		
	}
	
	

}
