package com.szymon.factory;

public class AudiCarFactory implements CarFactor  {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("a3")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("a3", audiEngine, audiWheels);
        } else if (model.equals("tt")) {
            Engine audiEngine = new Engine(120, 2000, "gas");
            Wheels audiWheels = new Wheels(16, "winter");
            car = new Audi("tt", audiEngine, audiWheels);
        } else if (model.equals("s3")) {
            Engine audiEngine = new Engine(360, 5000, "gas");
            Wheels audiWheels = new Wheels(19, "summer");
            car = new Audi("s3", audiEngine, audiWheels);
        }
        return car;
    }
}
