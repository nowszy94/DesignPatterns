package com.szymon.factory;

public class MercedesCarFactory implements CarFactor {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("s600")) {
            Engine mercedesEngine = new Engine(300, 3000, "gas");
            Wheels mercedesWheels = new Wheels(19, "winter");
            car = new Mercedes("s600", mercedesEngine, mercedesWheels);
        } else if (model.equals("cls-500")) {
            Engine mercedesEngine = new Engine(350, 5000, "gas");
            Wheels mercedesWheels = new Wheels(19, "summer");
            car = new Mercedes("cls-500", mercedesEngine, mercedesWheels);
        }
        return car;
    }
}
