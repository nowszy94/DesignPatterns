package com.szymon.queue;

import com.szymon.builder.User;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractQueue implements Queue {

    protected List<User> users;

    public AbstractQueue() {
        users = new ArrayList<>();
    }

    @Override
    public User pop() {
        return !users.isEmpty() ? users.remove(0) : null;
    }
}
