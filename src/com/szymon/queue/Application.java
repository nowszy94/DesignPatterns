package com.szymon.queue;

import com.szymon.Action;
import com.szymon.builder.User;

/**
 * Created by Szymon on 2017-06-09.
 */
public class Application {
    public static void main(String[] args) {
        Queue queue = new FifoQueue();
        queue.push(new User("Szymon", "Nowak", "1234", 23));
        queue.push(new User("Jan", "Kowalski", "1234", 23));

        System.out.println(queue.pop());
        queue.push(new User("kjanlkh", "afsfa", "1234", 23));
        System.out.println(queue.pop());
    }
}
