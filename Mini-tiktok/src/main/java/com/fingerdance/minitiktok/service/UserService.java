package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.pojo.User;
import com.fingerdance.minitiktok.pojo.UserResponse;

public interface UserService {
    public User register(String username, String password) throws Exception;

    public User login(String username, String password) throws Exception;
}
