package com.breeze.yigo.item.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.yigo.item.dao.ItemParamItemDao;
import com.breeze.yigo.item.entity.Item;
import com.breeze.yigo.item.entity.ItemParamItem;
import com.breeze.yigo.item.service.ItemParamItemService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.Map;

@Service
public class ItemParamItemServiceImpl extends ServiceImpl<ItemParamItemDao, ItemParamItem> implements ItemParamItemService {

    @Autowired(required = false)
    ItemParamItemDao itemParamItemDao;
    public R queryByItemId(Long itemId){
        ItemParamItem itemParamItem = itemParamItemDao.selectOne(new QueryWrapper<ItemParamItem>().lambda()
                .eq(ItemParamItem::getItemId, itemId)
        );
        return RUtil.setOK("查询商品规则成功",itemParamItem);
    }
}
