package com.wjm.yigou.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @PackgeName: com.wjm.yigou.server
 * @ClassName: OrderServerApplication
 * @Author: Administrator
 * Date: 2019/9/21 21:49
 * project name: YiGou
 * @Version:
 * @Description:
 */
@EnableFeignClients
@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class,args);
    }
}
