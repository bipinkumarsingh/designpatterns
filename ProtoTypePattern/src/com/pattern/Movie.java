package com.pattern;

public class Movie  implements ProtoTypeCapable{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Movie clone() throws CloneNotSupportedException
	{
	  System.out.println("Clone movie object");
	  return (Movie)super.clone();
	}
	
	public String toString()
	{
		 return "Movie";
	}

}
