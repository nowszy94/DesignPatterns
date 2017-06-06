package com.szymon;

import com.szymon.builder.User;

import java.util.Arrays;
import java.util.List;
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

        actions.forEach(e -> e.doAction());
    }
}
