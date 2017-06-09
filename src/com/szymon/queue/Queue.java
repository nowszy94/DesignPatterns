package com.szymon.queue;

import com.szymon.builder.User;

/**
 * Created by Szymon on 2017-06-09.
 */
public interface Queue {
    void push(User user);

    User pop();
}
