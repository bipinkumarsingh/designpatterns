package com.pattern;

public class main {

	public static void main(String args[]) {
		User u1=new  User.UserBuilder("bipin", "vaishali").age(28).phone("898988").build();	
		System.out.println("User-->"+u1);
	}
	
	
}
