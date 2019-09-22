package com.breeze.yigo.item.controller;

import com.breeze.yigo.item.entity.ItemParam;
import com.breeze.yigo.item.service.ItemParamService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(tags = "商品规格参数表的操作")
@RestController
public class ItemParamController {
    @Autowired
    ItemParamService itemParamService;

    public R insertByCid(@RequestParam Long cid,@RequestParam String paramdata){
        ItemParam itemParam = new ItemParam();
        itemParam.setItemCarId(cid);
        itemParam.setParamData(paramdata);
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        return RUtil.setR(itemParamService.save(itemParam),"添加规格成功");
    }
}
