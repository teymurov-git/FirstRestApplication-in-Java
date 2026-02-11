package com.restapi.firstrestapplicationjava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateUserResponse {
    Long id;
    String name;
    String surname;
    String email;
    String password;
    int age;
}
