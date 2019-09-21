package com.qfedu.wy.seckill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    11:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_seckillItem")
public class SeckillItem {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    
    private String name;
    
    private Integer price;
    
    private Integer stock;
    
    private String imgUrl;
    
    private Date beginTime;
    
    private Date endTime;
    
    private Integer sales;
}
