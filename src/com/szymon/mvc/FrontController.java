package com.szymon.mvc;

import com.szymon.builder.User;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
    private Map<String, Controller> controllers;
    private Map<String, View> views;

    public FrontController() {
        controllers = new HashMap<>();
        views = new HashMap<>();

        setupControllers();
        setupViews();
    }

//    handle("home.json")
    public void handle(String value) {
        String[] split = value.split(" ");
        Object object;
        if (controllers.containsKey(split[0])) {
            //1. Wybieramy controller i wywolujemy jego metode ktora zwraca obiekt
            Controller controller = controllers.get(split[0]);
            object = controller.handle();

            //2. Wywolujemy widok
            if (views.containsKey(split[1])) {
                View<User> view = views.get(split[1]);
                System.out.println(view.home((User) object));
            }
        } else {
            System.out.println("Controller for " + split[0] + " not found");
        }
    }

    private void setupControllers() {
        controllers.put("home", new HomeController());
        controllers.put("about", new AboutController());
    }

    private void setupViews() {
        views.put("json", new JsonView());
        views.put("html", new HtmlView());
    }
}
