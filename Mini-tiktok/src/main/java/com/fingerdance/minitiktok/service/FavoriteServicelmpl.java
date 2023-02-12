package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.pojo.Favorite;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServicelmpl implements FavoriteService {
    @Override
    public Favorite action(int video_id, int action_type) throws Exception {
        return new Favorite((long) video_id,action_type,action_type,true);
    }

    @Override
    public Favorite list(int user_id) throws Exception {
        return null;
    }
}
