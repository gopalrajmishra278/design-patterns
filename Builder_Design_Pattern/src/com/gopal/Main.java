package com.gopal;

public class Main {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
				     .setUserId("C23")
				     .setUserName("Gopal")
				     .setEmailId("gopal123@gmail.com")
				     .build();
		
		System.out.println(user);
		
		User user2 =  User.UserBuilder
				 .builder()
			     .setUserId("C24")
			     .setUserName("Amit")
			     .setEmailId("amit89@gmail.com")
			     .build();
		
		System.out.println(user2);
		

	}

}
