package com.qfedu.wy.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.common.vo.R;
import com.qfedu.wy.shop.entity.Item;
import com.qfedu.wy.shop.entity.ShoppingCart;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    23:16
 */
public interface ShoppingCartService extends IService<ShoppingCart> {
    
    R addItemById(Integer id);
    
   List<ShoppingCart> findItemByUid(Integer id);
   
   Item findInfoByItemId(Integer id);
   
   int delItemById(Integer itemId);

    void delBatch(List<String> ids);
}
