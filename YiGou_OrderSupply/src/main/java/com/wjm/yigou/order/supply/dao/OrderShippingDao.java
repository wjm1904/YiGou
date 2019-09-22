package com.wjm.yigou.order.supply.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjm.yigou.order.supply.entity.OrderShipping;

import java.util.List;

/**
 * @PackgeName: com.wjm.yigou.order.supply.dao
 * @ClassName: OrderShippingDao
 * @Author: wjm
 * Date: 2019/9/21 18:00
 * project name: YiGou
 * @Version:
 * @Description:
 */
public interface OrderShippingDao extends BaseMapper<OrderShipping> {
    List<OrderShipping> findAll();

    int updateOrderShipping(OrderShipping orderShipping);
}
