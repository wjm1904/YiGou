package com.wjm.yigou.server.service;

import com.qf.common.vo.R;
import com.wjm.yigou.order.supply.entity.OrderShipping;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @PackgeName: com.wjm.yigou.server.service
 * @ClassName: OrderShippingService
 * @Author: Administrator
 * Date: 2019/9/22 14:59
 * project name: YiGou
 * @Version:
 * @Description:
 */
@FeignClient("OrderProviderWJM")
public interface OrderShippingService {
    @PostMapping("web/order/shipping/save.do")
    R save(@RequestBody OrderShipping orderShipping);

    @DeleteMapping("web/order/shipping/delete.do")
    R delete(@RequestParam("id") Integer id);

    @GetMapping("web/order/shipping/findById.do")
    R findById(@RequestParam("id") Integer id);

    @PutMapping("web/order/shipping/update.do")
    R update(OrderShipping orderShipping);
}
