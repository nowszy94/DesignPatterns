package com.szymon.queue;

import com.szymon.builder.User;

public class FifoQueue extends AbstractQueue {

    @Override
    public void push(User user) {
        users.add(user);
    }
}
