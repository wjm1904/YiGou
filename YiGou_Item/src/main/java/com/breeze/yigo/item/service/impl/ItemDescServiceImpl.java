package com.breeze.yigo.item.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.yigo.item.dao.ItemDescDao;
import com.breeze.yigo.item.entity.ItemDesc;
import com.breeze.yigo.item.service.ItemDescService;
import org.springframework.stereotype.Service;

@Service
public class ItemDescServiceImpl extends ServiceImpl<ItemDescDao, ItemDesc> implements ItemDescService {
}
