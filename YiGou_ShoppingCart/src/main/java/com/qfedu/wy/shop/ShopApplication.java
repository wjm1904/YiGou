package com.qfedu.wy.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    19:34
 */
@SpringBootApplication
@MapperScan("com.qfedu.wy.shop.dao")
@EnableSwagger2
public class ShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class,args);
    }
}
