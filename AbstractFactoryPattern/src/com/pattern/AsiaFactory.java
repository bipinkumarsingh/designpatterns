package com.pattern;

public class AsiaFactory {

    public static Car buildcar(CarType model)
    {
        Car car=null;
        switch (model)
        {
            case SEDAN:
                car= new LuxuryCar(model,Location.ASIA);
                break;
            case LUXURY:
                car= new LuxuryCar(model,Location.ASIA);
             default:
                break;
        }
        return  car;
    }

}
