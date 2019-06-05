package com.pattern;

public class Main {
	
	public static void  main(String args[]) throws CloneNotSupportedException {
	   
		Movie movie= (Movie)ProtoTypeFactory.getInstance(ModelType.MOVIE.toString());
		System.out.println("Object-->"+movie.toString());
	 
		
	}

}
