package com.szymon;

import java.io.File;
import java.util.*;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        Action action = new ActionImpl();
        Action action1 = () -> System.out.println("hello From lambda");
        Action action2 = new Action() {
            @Override
            public void doAction() {
                System.out.println("Hello from lambda");
            }
        };

        List<Action> actions = Arrays.asList(action, action1);

        List<String> names = Arrays.asList("Szymon", "Adam", "Anna");

        List<List<String>> nameList = Arrays.asList(
                Arrays.asList("Szymon", "Wojciech", "Adam"),
                Arrays.asList("Anna", "Janina", "Malgorzata"));

        System.out.println("List");
        nameList.stream()
                .flatMap(e -> e.stream())
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("A");
                    }
                })
                .filter(e -> e.startsWith("A"))
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
        map.put("woman", Arrays.asList("Anna", "Janina", "Malgorzata"));

        System.out.println("\nMap");
        map.entrySet()
                .stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

        names.stream()
                .filter(new Blabla())
                .flatMap(e -> Arrays.asList(e.split("")).stream())
                .distinct()
                .sorted();
//                .forEach(System.out::println);
//        actions.forEach(e -> e.doAction());
    }
}
