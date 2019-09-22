package com.wjm.yigou.order.supply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.dao.OrderShippingDao;
import com.wjm.yigou.order.supply.entity.OrderShipping;
import com.wjm.yigou.order.supply.service.OrderShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackgeName: com.wjm.yigou.order.supply.service.impl
 * @ClassName: OrderShippingServiceImpl
 * @Author: wjm
 * Date: 2019/9/21 19:04
 * project name: YiGou
 * @Version:
 * @Description:
 */
@Service
public class OrderShippingServiceImpl extends ServiceImpl<OrderShippingDao, OrderShipping> implements OrderShippingService {

    @Autowired
    private OrderShippingService orderShippingService;

    @Override
    public R updateOrderShipping(OrderShipping orderShipping) {
        return orderShippingService.updateOrderShipping(orderShipping);
    }
}
