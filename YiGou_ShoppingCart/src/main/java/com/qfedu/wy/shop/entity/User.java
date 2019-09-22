package com.qfedu.wy.shop.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    19:43
 */
@Data
public class User {
    
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;
}
