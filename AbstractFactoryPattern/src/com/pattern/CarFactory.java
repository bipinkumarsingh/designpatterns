package com.pattern;

public class CarFactory {

    private CarFactory()
    {

    }

    public static Car buildCar(CarType model)
    {
        Car car=null;
        Location location=Location.USA;

        switch (location)
        {
            case USA:
                car=AsiaFactory.buildcar(model);
                break;
            case ASIA:
                car=USAFactory.buildcar(model);
                break;

                default:
                    break;
        }
        return car;
    }

}
