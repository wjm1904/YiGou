package com.qfedu.wy.shop.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-22
 * Time:    0:16
 */
@Data
public class Item {
    
    private Long id;
    private String title;
    private String sellPoint;
    private Long price;
    private Integer num;
    private String image;
    private Long cid;
    private Integer status;
    private Date created;
    private Date updated;
}
