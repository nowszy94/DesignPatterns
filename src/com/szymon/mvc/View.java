package com.szymon.mvc;

public interface View<T> {
    String home(T model);
}
