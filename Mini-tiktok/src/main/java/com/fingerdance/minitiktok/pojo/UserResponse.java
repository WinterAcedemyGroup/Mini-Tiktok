package com.fingerdance.minitiktok.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fingerdance.minitiktok.response.ResponseCode;
import com.fingerdance.minitiktok.response.ResponseData;

@lombok.Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserResponse extends ResponseData {

    /**
     * 用户id
     */
    private long userId;

    /**
     * 用户鉴权token
     */
    private String token;

    public static UserResponse success(long userId, String token) {
        UserResponse resultData = new UserResponse();
        resultData.setStatusCode(ResponseCode.RC200.getCode());
        resultData.setStatusMsg(ResponseCode.RC200.getMessage());
        resultData.setToken(token);
        resultData.setUserId(userId);
        return resultData;
    }
}