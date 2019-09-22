package com.wjm.yigou.order.supply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.dao.OrderDao;
import com.wjm.yigou.order.supply.dao.OrderShippingDao;
import com.wjm.yigou.order.supply.entity.OrderShipping;
import com.wjm.yigou.order.supply.service.OrderService;
import com.wjm.yigou.order.supply.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackgeName: com.wjm.yigou.order.supply.service.impl
 * @ClassName: OrderServiceImpl
 * @Author: wjm
 * Date: 2019/9/21 20:58
 * project name: YiGou
 * @Version:
 * @Description:
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderVO> implements OrderService {

    @Autowired(required = false)
    private OrderDao orderDao;

    @Autowired(required = false)
    private OrderShippingDao orderShippingDao;

    @Override
    public R<Map<String, Object>> findPayment(Integer id) {
        List<OrderShipping> list = orderShippingDao.findAll();
        OrderVO payment = orderDao.findPayment(id);

        payment.setTotalFee(payment.getPrice()*payment.getNum());
        Map<String, Object> map = new HashMap<>();
        map.put("list",list);
        map.put("payment",payment);

        return RUtil.setOK("查询提交订单页面的订单成功",map);
    }

}
