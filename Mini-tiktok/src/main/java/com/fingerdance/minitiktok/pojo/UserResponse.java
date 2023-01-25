package com.fingerdance.minitiktok.pojo;

import com.fingerdance.minitiktok.response.ResponseCode;
import com.fingerdance.minitiktok.response.ResponseData;

@lombok.Data
public class UserResponse extends ResponseData {
    /**
     * 用户鉴权token
     */
    private String token;
    /**
     * 用户id
     */
    private long userid;

    public static UserResponse success(long userid, String token) {
        UserResponse resultData = new UserResponse();
        resultData.setStatusCode(ResponseCode.RC200.getCode());
        resultData.setStatusMsg(ResponseCode.RC200.getMessage());
        resultData.setToken(token);
        resultData.setUserid(userid);
        return resultData;
    }
}