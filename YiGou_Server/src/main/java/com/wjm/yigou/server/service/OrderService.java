package com.wjm.yigou.server.service;

import com.qf.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @PackgeName: com.wjm.yigou.server.service
 * @ClassName: OrderService
 * @Author: wjm
 * Date: 2019/9/21 21:58
 * project name: YiGou
 * @Version:
 * @Description:
 */
@FeignClient("OrderProviderWJM")
public interface OrderService {
    @GetMapping("/web/order/findOrderById.do")
    R<Map<String, Object>> findOrderById(@RequestParam("id") Integer id);
}
