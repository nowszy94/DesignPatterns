package com.szymon.mvc;

import com.szymon.builder.User;

/**
 * Created by Szymon on 2017-06-06.
 */
public class HomeController implements Controller {

    @Override
    public Object handle() {
        return new User("Szymon", "Nowak", "789456123", 23);
    }

}
