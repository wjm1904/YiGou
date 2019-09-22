package com.wjm.yigou.order.supply.controller;

import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @PackgeName: com.wjm.yigou.order.supply.controller
 * @ClassName: OrderController
 * @Author: Administrator
 * Date: 2019/9/21 19:08
 * project name: YiGou
 * @Version:
 * @Description:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/web/order/findOrderById.do")
    public R<Map<String, Object>> findOrderById(@RequestParam("id") Integer id) {
        return orderService.findPayment(id);
    }
}
