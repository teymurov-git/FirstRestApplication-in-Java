package com.restapi.firstrestapplicationjava.dto;

import lombok.Data;

@Data
public class CreateUserRequest {
    String name;
    String surname;
    String email;
    String password;
    int age;
}
