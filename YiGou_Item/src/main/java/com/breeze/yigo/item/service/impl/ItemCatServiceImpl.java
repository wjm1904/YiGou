package com.breeze.yigo.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.yigo.item.dao.ItemCatDao;
import com.breeze.yigo.item.entity.ItemCat;
import com.breeze.yigo.item.service.ItemCatService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ItemCatServiceImpl extends ServiceImpl<ItemCatDao, ItemCat> implements ItemCatService {
    @Autowired(required = false)
    ItemCatDao itemCatDao;
    @Override
    public R queryParent() {
        List<ItemCat> itemCats = itemCatDao.queryParent();
        return RUtil.setOK("查询成功",itemCats);
    }

    @Override
    public R queryChild(@RequestParam int id) {
        List<ItemCat> itemCats = itemCatDao.queryChild(id);
        return RUtil.setOK("查询成功",itemCats);
    }
}
