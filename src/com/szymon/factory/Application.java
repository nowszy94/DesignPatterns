package com.szymon.factory;

public class Application {
    public static void main(String[] args) {
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        Car car = audiCarFactory.buildCar("a3");

    }
}
