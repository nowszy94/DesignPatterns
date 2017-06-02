package com.szymon.factory;

public class BMWCarFactory implements CarFactor {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("x5")) {
            Engine engine = new Engine(180, 2000, "diesel");
            Wheels wheels = new Wheels(20, "winter");
            car = new Mercedes("x5", engine, wheels);
        } else if(model.equals("m3")) {
            Engine engine = new Engine(250, 3000, "diesel");
            Wheels wheels = new Wheels(28, "summer");
            car = new Mercedes("m3", engine, wheels);
        }
        return car;
    }
}
