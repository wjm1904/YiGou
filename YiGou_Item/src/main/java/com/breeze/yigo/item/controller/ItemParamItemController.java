package com.breeze.yigo.item.controller;


import com.breeze.yigo.item.entity.ItemParamItem;
import com.breeze.yigo.item.service.ItemParamItemService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@Api(tags = "商品规格表的操作")
@RestController
public class ItemParamItemController {
    @Autowired
    ItemParamItemService itemParamItemService;

    public R insert(@RequestParam long itemId,@RequestParam String paramData){
        ItemParamItem itemParamItem = new ItemParamItem();
        itemParamItem.setParamData(paramData);
        itemParamItem.setCreated(new Date());
        itemParamItem.setUpdated(new Date());
        itemParamItemService.save(itemParamItem);
        return RUtil.setOK("添加商品规格成功");
    }
    @GetMapping("nolog/provider/itemparamitem/query.do")
    public R query(@RequestParam long itemId){
        return itemParamItemService.queryByItemId(itemId);
    }
}
