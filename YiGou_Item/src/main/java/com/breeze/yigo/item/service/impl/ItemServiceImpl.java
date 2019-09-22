package com.breeze.yigo.item.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.yigo.item.dao.ItemDao;
import com.breeze.yigo.item.entity.Item;
import com.breeze.yigo.item.service.ItemService;
import com.qf.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemDao, Item> implements ItemService {
    @Autowired(required = false)
    ItemDao itemDao;
}
