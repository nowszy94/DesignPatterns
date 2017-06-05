package com.szymon.dao;

import com.szymon.builder.User;

import java.io.File;
import java.util.List;

public class Application {

    private static final String PATH = "C:\\Users\\Szymon\\sda\\DesignPatterns\\users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));
        userDao.addUser(User.builder()
                .firstName("Michal")
                .lastName("Wisniewski")
                .phoneNumber("1234678532")
                .age(33)
                .build());

        List<User> allUsers = userDao.getAllUsers();
        allUsers.forEach(e -> System.out.println(e));
//        allUsers.forEach(System.out::println);
    }
}
