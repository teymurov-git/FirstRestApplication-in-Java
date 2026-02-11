package com.restapi.firstrestapplicationjava.service;

import com.restapi.firstrestapplicationjava.dto.*;
import com.restapi.firstrestapplicationjava.entity.UserEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    private static Map<Long, UserEntity> users = new HashMap<>();
    private static Long generatedUserId = 0L;

    public static CreateUserResponse createUser(CreateUserRequest request){
        var id = ++generatedUserId;
        var userEnt = new UserEntity(id, request.getName(), request.getSurname(), request.getEmail(), request.getPassword(), request.getAge());
        users.put(id, userEnt);
        return new CreateUserResponse(id, request.getName(), request.getSurname(), request.getEmail(), request.getPassword(), request.getAge());
    }

    public void showUsers(){
        System.out.println("Users" + users.values());
    }

    @PostConstruct
    public void init(){
        users = Stream.of(
                new UserEntity(++generatedUserId, "Yusif", "Teymurlu", "info@example.com", "admin1234", 24),
                new UserEntity(++generatedUserId, "Salam", "Namiqov", "info@example.com", "admin12", 25),
                new UserEntity(++generatedUserId, "Rauf", "Mirzayev", "info@example.com", "admin12345", 24)
                ).collect(Collectors.toMap(UserEntity::getId,
                                            Function.identity(),
                                            (newVal, oldVal) -> oldVal
                ));
    }

}



//public static CreateUserResponse createUser(CreateUserRequest request){
//    return CreateUserResponse.builder()
//            .name(request.getName())
//            .surname(request.getSurname())
//            .email(request.getEmail())
//            .password(request.getPassword())
//            .age(request.getAge())
//            .build();
//}
