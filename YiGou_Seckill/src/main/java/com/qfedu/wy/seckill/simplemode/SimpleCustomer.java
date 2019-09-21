package com.qfedu.wy.seckill.simplemode;


import com.qfedu.wy.seckill.dao.SeckillItemDao;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-07
 * Time:    23:18
 */
@Component
@RabbitListener(queues = "q_simple")
public class SimpleCustomer {

    @Autowired(required = false)
    private SeckillItemDao seckillItemDao;

    @RabbitHandler
    public void receive(Integer id) {
        System.out.println(id);
        seckillItemDao.updateStock(id);



    }
}
