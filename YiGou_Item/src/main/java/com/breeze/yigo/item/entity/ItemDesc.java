package com.breeze.yigo.item.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("tb_item_desc")
@Data
public class ItemDesc {
    @TableId(value = "itemId")
    private Long itemId;
    private String iemDesc;
    private Date created;
    private Date updated;
}
