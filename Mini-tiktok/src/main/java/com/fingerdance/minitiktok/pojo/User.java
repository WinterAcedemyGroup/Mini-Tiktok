package com.fingerdance.minitiktok.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long id;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

}
