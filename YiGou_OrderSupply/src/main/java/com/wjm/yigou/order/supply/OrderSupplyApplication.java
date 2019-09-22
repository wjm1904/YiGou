package com.wjm.yigou.order.supply;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackgeName: com.wjm.yigou.order.supply
 * @ClassName: OrderSupplyApplication
 * @Author: wjm
 * Date: 2019/9/21 10:19
 * project name: YiGou
 * @Version:
 * @Description:
 */
@SpringBootApplication  //开关类
@EnableDiscoveryClient  //注册服务
@MapperScan("com.wjm.yigou.order.supply.dao")   //扫描dao层
public class OrderSupplyApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSupplyApplication.class,args);
    }
}
