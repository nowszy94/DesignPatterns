package com.szymon.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private int age;

    private String zipCode;
}
