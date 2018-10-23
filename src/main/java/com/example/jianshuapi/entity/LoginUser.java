package com.example.jianshuapi.entity;

import lombok.Builder;
import lombok.Data;

/**
 * LoginUser DTO
 */
@Data
@Builder
public class LoginUser {
    private String email;
    private String password;
}
