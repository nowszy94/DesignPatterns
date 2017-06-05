package com.szymon.dao;

import com.szymon.builder.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);
}
