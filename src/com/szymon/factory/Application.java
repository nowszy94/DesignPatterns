package com.szymon.factory;

public class Application {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car2 = abstractCarFactory.buildBMWCar("x5");
        Car car3 = abstractCarFactory.buildMercedesCar("cls-500");
    }
}
