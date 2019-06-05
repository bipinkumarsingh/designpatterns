package com.pattern;

public class USAFactory {

    public static Car buildcar(CarType model)
    {
        Car car=null;
        switch (model)
        {
            case SEDAN:
                car= new SedanCar(model,Location.USA);
                break;
            case LUXURY:
                car= new LuxuryCar(model,Location.USA);
             default:
                break;
        }
        return  car;
    }

}
