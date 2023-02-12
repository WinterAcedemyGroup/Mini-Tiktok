package com.fingerdance.minitiktok.controller;


import com.auth0.jwt.interfaces.Claim;
import com.fingerdance.minitiktok.service.FavoriteService;
import com.fingerdance.minitiktok.pojo.Favorite;
import com.fingerdance.minitiktok.pojo.FavoriteResponse;
import com.fingerdance.minitiktok.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/douyin/favorite")
public class FavoriteController {

    @Autowired
    FavoriteService favoriteService;

    @RequestMapping(value = "/action", method = POST)
    public FavoriteResponse action(@RequestParam String token, @RequestParam int video_id, @RequestParam int action_type) throws Exception {

        // token认证
        Map<String, Claim> claimMap = JwtUtils.verifyToken(token);
        if(claimMap != null) return null;
        Favorite favorite = favoriteService.action(video_id, action_type);

        return FavoriteResponse.success(favorite);
    }

    @RequestMapping(value = "/list", method = POST)
    public FavoriteResponse list(@RequestParam int user_id, @RequestParam String token) throws Exception {
        Favorite favorite = favoriteService.list(user_id);
        return FavoriteResponse.success();
    }

}
