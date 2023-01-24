package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.mapper.UserRepository;
import com.fingerdance.minitiktok.pojo.Response;
import com.fingerdance.minitiktok.pojo.User;
import com.fingerdance.minitiktok.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Response register(String username, String password) throws Exception {
        User query = userRepository.queryByName(username);
        if (query != null) {
            throw new Exception("该用户已存在");
        }
        userRepository.add(username, SecurityUtils.encode(password));
        return null;
    }

    @Override
    public Response login(String username, String password) throws Exception{
        User query = userRepository.queryByName(username);
        if (query == null) {
            throw new Exception("该用户不存在");
        }
        boolean passwordMatches = SecurityUtils.match(password, query.getPassWord());
        if (!passwordMatches) {
            throw new Exception("用户名或密码错误");
        }
        return null;
    }
}
