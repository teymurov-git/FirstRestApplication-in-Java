package com.restapi.firstrestapplicationjava.dto;

import lombok.Builder;
import lombok.Data;

import static com.restapi.firstrestapplicationjava.util.Constant.*;

@Data
@Builder
public class ApiResponse<T> {

    boolean success;
    String message;
    T data;

    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(SUCCESS_MESSAGE)
                .data(data)
                .build();
    }
}