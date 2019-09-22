package com.breeze.yigo.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.breeze.yigo.item.entity.ItemParamItem;
import com.qf.common.vo.R;

public interface ItemParamItemService extends IService<ItemParamItem> {
    public R queryByItemId(Long itemId);
}
