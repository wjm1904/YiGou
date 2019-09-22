package com.wjm.yigou.order.supply.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjm.yigou.order.supply.vo.OrderVO;

/**
 * @PackgeName: com.wjm.yigou.order.supply.dao
 * @ClassName: OrderDao
 * @Author: wjm
 * Date: 2019/9/21 17:16
 * project name: YiGou
 * @Version:
 * @Description:
 */
public interface OrderDao extends BaseMapper<OrderVO> {

    /**
     * 点击购物车中的去结算按钮后，会展示出结算页的订单信息
     * @param id
     * @return
     */
    OrderVO findPayment(Integer id);
}
