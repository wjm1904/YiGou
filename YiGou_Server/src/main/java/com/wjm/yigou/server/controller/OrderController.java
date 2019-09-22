package com.wjm.yigou.server.controller;

import com.qf.common.vo.R;
import com.wjm.yigou.server.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @PackgeName: com.wjm.yigou.server.controller
 * @ClassName: OrderController
 * @Author: Administrator
 * Date: 2019/9/21 22:03
 * project name: YiGou
 * @Version:
 * @Description:
 */
@RestController
@Api(value = "操作订单",tags = "操作订单")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "点击去结算后，生成一个结算页面的订单信息", notes = "点击去结算后，生成一个结算页面的订单信息")
    @GetMapping("web/server/findOrderById.do")
    public R<Map<String, Object>> findOrderById(@RequestParam("id")Integer id) {
        return orderService.findOrderById(id);
    }
}
