package com.fingerdance.minitiktok.controller;

import com.fingerdance.minitiktok.pojo.UserResponse;
import com.fingerdance.minitiktok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/douyin/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = POST)
    public UserResponse register(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.register(username, password);
    }

    @RequestMapping(value = "/login", method = POST)
    public UserResponse login(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.login(username, password);
    }


}
