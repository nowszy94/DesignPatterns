package com.szymon.singleton;

public class Producer {
    public static void addValue(String value) {
        Queue.getInstance()
                .push(value);
    }
}
