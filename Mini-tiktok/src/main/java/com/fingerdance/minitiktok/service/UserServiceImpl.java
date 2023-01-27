package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.mapper.UserRepository;
import com.fingerdance.minitiktok.pojo.UserResponse;
import com.fingerdance.minitiktok.pojo.User;
import com.fingerdance.minitiktok.utils.JwtUtils;
import com.fingerdance.minitiktok.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User register(String username, String password) throws Exception {
        User query = userRepository.queryByName(username);
        if (query != null) {
            throw new Exception("该用户已存在");
        }
        User user = new User(null, username, SecurityUtils.encode(password));
        userRepository.add(user);
        return user;
    }

    @Override
    public User login(String username, String password) throws Exception{
        User user = userRepository.queryByName(username);
        if (user == null) {
            throw new Exception("该用户不存在");
        }
        boolean passwordMatches = SecurityUtils.match(password, user.getPassWord());
        if (!passwordMatches) {
            throw new Exception("用户名或密码错误");
        }
        return user;
    }
}
