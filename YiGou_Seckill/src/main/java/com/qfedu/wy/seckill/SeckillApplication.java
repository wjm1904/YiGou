package com.qfedu.wy.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    10:46
 */
@SpringBootApplication
@MapperScan("com.qfedu.wy.seckill.dao")
@EnableSwagger2
public class SeckillApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class,args);
    }
}
