package com.fingerdance.minitiktok.service;

import com.fingerdance.minitiktok.pojo.Favorite;
import org.springframework.web.bind.annotation.RequestParam;

public interface FavoriteService {
    public Favorite action(int video_id, int action_type) throws Exception;

    public Favorite list(int user_id) throws Exception;
}
