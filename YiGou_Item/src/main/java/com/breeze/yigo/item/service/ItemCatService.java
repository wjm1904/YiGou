package com.breeze.yigo.item.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.breeze.yigo.item.entity.ItemCat;
import com.qf.common.vo.R;

public interface ItemCatService extends IService<ItemCat> {
    R queryParent();
    R queryChild(int id);
}
