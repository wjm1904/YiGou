package com.qfedu.wy.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.qfedu.wy.shop.dao.ShopDao;
import com.qfedu.wy.shop.entity.Item;
import com.qfedu.wy.shop.entity.ShoppingCart;
import com.qfedu.wy.shop.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    23:17
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShopDao,ShoppingCart> implements ShoppingCartService {
    
    @Autowired(required = false)
    private ShopDao shopDao;
    @Override
    public R addItemById(Integer id) {
        // shopDao.addItemById(id);
        return RUtil.setR(shopDao.addItemById(id),"ok");
    }

    @Override
    public List<ShoppingCart> findItemByUid(Integer id) {
        return shopDao.findItemByUid(id);
    }

    @Override
    public Item findInfoByItemId(Integer id) {
        return shopDao.findInfoByItemId(id);
    }

    @Override
    public int delItemById(Integer itemId) {
        return shopDao.delItemById(itemId);
    }

    @Override
    public void delBatch(List<String> ids) {
         shopDao.delBatch(ids);
    }
}
