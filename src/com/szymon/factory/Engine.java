package com.szymon.factory;

/**
 * Created by Szymon on 2017-06-02.
 */
public class Engine {
    private int horsePower;

    private int capicity;

    private String type;

    public Engine(int horsePower, int capicity, String type) {
        this.horsePower = horsePower;
        this.capicity = capicity;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapicity() {
        return capicity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capicity=" + capicity +
                ", type='" + type + '\'' +
                '}';
    }
}
