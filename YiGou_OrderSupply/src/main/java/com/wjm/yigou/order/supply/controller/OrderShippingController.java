package com.wjm.yigou.order.supply.controller;

import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.entity.OrderShipping;
import com.wjm.yigou.order.supply.service.OrderShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PackgeName: com.wjm.yigou.order.supply.controller
 * @ClassName: OrderShippingController
 * @Author: Administrator
 * Date: 2019/9/22 14:51
 * project name: YiGou
 * @Version:
 * @Description:
 */
@RestController
public class OrderShippingController {

    @Autowired
    private OrderShippingService orderShippingService;

    @PostMapping("web/order/shipping/save.do")
    public R save(@RequestBody OrderShipping orderShipping) {
        return RUtil.setR(orderShippingService.save(orderShipping),"新增收货地址");
    }

    @DeleteMapping("web/order/shipping/delete.do")
    public R delete(@RequestParam("id") Integer id) {
        return RUtil.setR(orderShippingService.removeById(id),"删除收货地址");
    }

    @GetMapping("web/order/shipping/findById.do")
    public R findById(@RequestParam("id") Integer id) {
        return RUtil.setOK("查询指定id的收货地址", orderShippingService.getById(id));
    }

    @PutMapping("web/order/shipping/update.do")
    public R update(OrderShipping orderShipping) {
        return RUtil.setOK("修改指定id的收货地址", orderShippingService.updateOrderShipping(orderShipping));
    }
}
