package com.pattern;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeFactory {
	

	private static Map<String,ProtoTypeCapable> prototypes= new HashMap<String,ProtoTypeCapable>();
	
	
	
	static {
		prototypes.put(ModelType.MOVIE.toString(), new Movie());
		prototypes.put(ModelType.SHOW.toString(), new Show());
	}
	
	
	public static ProtoTypeCapable getInstance(String type) throws CloneNotSupportedException
	{
		return (ProtoTypeCapable) prototypes.get(type);
	}
	
}
