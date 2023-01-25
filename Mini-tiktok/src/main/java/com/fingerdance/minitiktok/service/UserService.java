package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.pojo.UserResponse;

public interface UserService {
    public UserResponse register(String username, String password) throws Exception;

    public UserResponse login(String username, String password) throws Exception;
}
