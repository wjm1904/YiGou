package com.breeze.yigo.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_item_cat")
public class ItemCat {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long ParentId;
    private String name;
    private Integer status;
    private Integer isParentId;
    private Date created;
    private Data updated;
}
