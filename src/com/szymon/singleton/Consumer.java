package com.szymon.singleton;

public class Consumer {
    public static void processValue() {
        Queue queue = Queue.getInstance();
        System.out.println("Next value is: "
                + queue.pop());
    }
}
