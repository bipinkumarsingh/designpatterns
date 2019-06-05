package com.pattern;

public class User {
	private final String name;
	private final String address;
	private final  int age;
	private  final String phone;
	
	public User(UserBuilder builder)
	{
		this.name=builder.name;
		this.address=builder.address;
		this.age=builder.age;
		this.phone=builder.phone;		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
	

public static  class UserBuilder {
	
	private final  String name;
	private final  String address;
	private   int age;
	private   String phone;

	
	UserBuilder(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	UserBuilder age(int age)
	{
		this.age=age;
		return this;
	}
	
	UserBuilder phone(String phone)
	{
		this.phone=phone;
		return this;
	}
	
	public User build()
	{
		User user=new User(this);
		return user;
	}
	
}


@Override
public String toString() {
	return "User [name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone + "]";
}


	
}
