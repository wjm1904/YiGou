package com.breeze.yigo.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_item_param_item")
public class ItemParamItem {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long itemId;
    private String ParamData;
    private Date created;
    private Date updated;
}
