package com.gopal;


 interface Subject {
	
	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	
	void notifyChanges(String title);

}
