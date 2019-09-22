package com.wjm.yigou.server.controller;

import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.entity.OrderShipping;
import com.wjm.yigou.server.service.OrderShippingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PackgeName: com.wjm.yigou.server.controller
 * @ClassName: OrderShippingController
 * @Author: Administrator
 * Date: 2019/9/22 15:03
 * project name: YiGou
 * @Version:
 * @Description:
 */
@RestController
@Api(value = "操作收货人信息",tags = "操作收货人信息")
public class OrderShippingController {

    @Autowired
    private OrderShippingService orderShippingService;

    @PostMapping("web/server/ordershipping/save.do")
    @ApiOperation(value = "新增收货地址", notes = "对收货地址进行新增操作")
    public R save(@RequestBody OrderShipping orderShipping) {
        return orderShippingService.save(orderShipping);
    }

    @PostMapping("web/server/ordershipping/delete.do")
    @ApiOperation(value = "删除收货地址", notes = "对收货地址进行删除操作")
    public R delete(@RequestParam("id") Integer id) {
        return orderShippingService.delete(id);
    }

    @PostMapping("web/server/ordershipping/findById.do")
    @ApiOperation(value = "查询指定id的收货地址", notes = "对指定的收货地址进行删除操作")
    public R findById(@RequestParam("id") Integer id) {
        return orderShippingService.findById(id);
    }

    @PostMapping("web/server/ordershipping/update.do")
    @ApiOperation(value = "修改指定id的收货地址", notes = "对指定的收货地址进行修改操作")
    public R update(@RequestBody OrderShipping orderShipping) {
        return orderShippingService.update(orderShipping);
    }
}
