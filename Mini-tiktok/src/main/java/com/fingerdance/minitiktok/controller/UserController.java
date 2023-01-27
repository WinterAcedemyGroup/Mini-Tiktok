package com.fingerdance.minitiktok.controller;

import com.fingerdance.minitiktok.pojo.User;
import com.fingerdance.minitiktok.pojo.UserResponse;
import com.fingerdance.minitiktok.service.UserService;
import com.fingerdance.minitiktok.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/douyin/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = POST)
    public UserResponse register(@RequestParam String username, @RequestParam String password) throws Exception {
        User user = userService.register(username, password);
        return UserResponse.success(user.getId(), JwtUtils.createToken(user));
    }

    @RequestMapping(value = "/login", method = POST)
    public UserResponse login(@RequestParam String username, @RequestParam String password) throws Exception {
        User user = userService.login(username, password);
        return UserResponse.success(user.getId(), JwtUtils.createToken(user));
    }


}
