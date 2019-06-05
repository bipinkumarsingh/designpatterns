package com.pattern;

public abstract class Car {
	
	private CarType model=null;
	
	protected abstract void construct();
	
	Car(CarType model)
	{
	this.model=model;
	 arrangeParts();
	}

	private void arrangeParts() {
      System.out.println("Arranging Part");		
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
}
