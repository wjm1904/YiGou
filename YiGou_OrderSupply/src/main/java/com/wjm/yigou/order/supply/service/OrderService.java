package com.wjm.yigou.order.supply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.vo.OrderVO;

import java.util.Map;

/**
 * @PackgeName: com.wjm.yigou.order.supply.service
 * @ClassName: OrderService
 * @Author: wjm
 * Date: 2019/9/21 20:54
 * project name: YiGou
 * @Version:
 * @Description:
 */
public interface OrderService extends IService<OrderVO> {

    /**
     * 点击购物车中的去结算按钮后，会展示出结算页的订单信息
     * @param id
     * @return
     */
    R<Map<String, Object>> findPayment(Integer id);
}
