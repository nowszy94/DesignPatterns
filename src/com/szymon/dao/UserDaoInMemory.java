package com.szymon.dao;

import com.szymon.builder.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoInMemory implements UserDao {

    private List<User> users;

    public UserDaoInMemory() {
        users = new ArrayList<>();
        users.add(User.builder()
                .firstName("Szymon")
                .lastName("Nowak")
                .age(23)
                .phoneNumber("1234567")
                .build());
        users.add(User.builder()
                .firstName("Anna")
                .lastName("Kowalska")
                .age(40)
                .phoneNumber("09876543")
                .build());
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
