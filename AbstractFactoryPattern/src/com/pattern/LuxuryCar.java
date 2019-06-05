package com.pattern;

public class LuxuryCar extends Car {

    public LuxuryCar(CarType model, Location location)
    {
        super(model,location);
        construct();

    }

    @Override
    protected void construct()
    {
     System.out.println("Constructing Luxury");
    }
}
