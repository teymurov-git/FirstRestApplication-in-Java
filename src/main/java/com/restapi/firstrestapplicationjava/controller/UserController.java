package com.restapi.firstrestapplicationjava.controller;

import com.restapi.firstrestapplicationjava.dto.ApiResponse;
import com.restapi.firstrestapplicationjava.dto.*;
import com.restapi.firstrestapplicationjava.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<CreateUserResponse>> createUser(@RequestBody CreateUserRequest request){


        var response = UserService.createUser(request);
        return ResponseEntity.ok(ApiResponse.success(response));
//        userService.showUsers();
//        return ResponseEntity.ok(ApiResponse.success(CreateUserResponse.builder().build()));


    }
}


//        1. var response = new CreateUserResponse();
//        response.setName(request.getName());
//        response.setSurname(request.getSurname());
//        response.setEmail(request.getEmail());
//        response.setPassword(request.getPassword());
//        response.setAge(request.getAge());
//        return response;
//        2. return CreateUserResponse.builder()
//                .name(request.getName())
//                .surname(request.getSurname())
//                .email(request.getEmail())
//                .password(request.getPassword())
//                .age(request.getAge())
//                .build();
