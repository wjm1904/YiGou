package com.qfedu.wy.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.common.vo.R;
import com.qfedu.wy.shop.entity.Item;
import com.qfedu.wy.shop.entity.ShoppingCart;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    19:50
 */
public interface ShopDao extends BaseMapper<ShoppingCart> {
    
    // 根据id添加商品
    boolean addItemById(Integer id);
    
    // 根据uid查询该用户所有购物车的商品
    List<ShoppingCart> findItemByUid(Integer id);
    
    Item findInfoByItemId(Integer id);
    
    // 根据商品id删除用户购物车里的商品
    int delItemById(Integer itemId);

    void delBatch(List<String> ids);
    
    
}
