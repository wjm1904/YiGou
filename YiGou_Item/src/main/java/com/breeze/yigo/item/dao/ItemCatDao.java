package com.breeze.yigo.item.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.breeze.yigo.item.entity.ItemCat;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemCatDao extends BaseMapper<ItemCat> {
    @Select("select * from tb_item_cat where parent_id = 0")
    List<ItemCat> queryParent();

    @Select("select * from tb_item_cat where parent_id = #{id}")
    List<ItemCat> queryChild(int id);
}
