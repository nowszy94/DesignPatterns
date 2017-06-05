package com.szymon.builder;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Szymon;Nowak;23;+48 12345678",
                "Michal;Wisniewski;33;987654345",
                "Anna;Kowalska;28;94726384");

        values.stream()
                .map(e -> {
                    String[] split = e.split(";");
                    return new User(
                            split[0], split[1], split[3], Integer.parseInt(split[2]));
                })
                .filter(e -> e.getAge() > 25)
                .forEach(System.out::println);
    }
}
