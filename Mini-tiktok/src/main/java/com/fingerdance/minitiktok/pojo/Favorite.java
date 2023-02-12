package com.fingerdance.minitiktok.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Favorite {

    private Long id;

    /**
     * 用户id
     */
    private int user_id;

    /**
     * 视频id
     */
    private int video_id;

    /**
     * 是否点赞
     */
    private boolean is_favorite;


}
