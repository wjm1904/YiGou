package com.breeze.yigo.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.yigo.item.dao.ItemParamDao;
import com.breeze.yigo.item.dao.ItemParamItemDao;
import com.breeze.yigo.item.entity.ItemParam;
import com.breeze.yigo.item.entity.ItemParamItem;
import com.breeze.yigo.item.service.ItemParamService;
import com.qf.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemParamServiceImpl extends ServiceImpl<ItemParamDao, ItemParam> implements ItemParamService {

}
