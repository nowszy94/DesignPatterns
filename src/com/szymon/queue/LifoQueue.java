package com.szymon.queue;

import com.szymon.builder.User;

/**
 * Created by Szymon on 2017-06-09.
 */
public class LifoQueue extends AbstractQueue {
    @Override
    public void push(User user) {
        users.add(0, user);
    }
}
