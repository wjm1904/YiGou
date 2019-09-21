package com.breeze.yigo.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_item_param")
public class ItemParam {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long ItemCarId;
    private String ParamData;
    private Date created;
    private Date updated;
}
