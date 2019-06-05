package com.pattern;

public class SedanCar extends Car {

    public  SedanCar(CarType model,Location location)
    {
        super(model,location);
        construct();

    }

    @Override
    protected void construct()
    {
     System.out.println("Constructing Sedan");
    }
}
