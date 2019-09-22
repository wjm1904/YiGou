package com.qfedu.wy.seckill.simplemode;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-07
 * Time:    23:17
 */
@Configuration
public class SimpleQueue {

    @Bean
    public Queue simple() {
        return new Queue("q_simple");
    }
}
