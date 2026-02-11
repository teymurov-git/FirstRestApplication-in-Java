package com.restapi.firstrestapplicationjava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserEntity{

    Long id;
    String name;
    String surname;
    String email;
    String password;
    int age;

}