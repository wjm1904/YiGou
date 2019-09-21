package com.qfedu.wy.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.common.util.MD5Utils;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.qfedu.wy.seckill.common.Common;
import com.qfedu.wy.seckill.dao.SeckillItemDao;
import com.qfedu.wy.seckill.entity.SeckillItem;
import com.qfedu.wy.seckill.service.SeckillItemService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    11:22
 */
@Service
public class SeckillServiceImpl extends ServiceImpl<SeckillItemDao, SeckillItem> implements SeckillItemService {
    
    private ConcurrentHashMap<String,Boolean> overMap = new ConcurrentHashMap<>();
    
    @Autowired(required = false)
    private SeckillItemDao seckillItemDao;

    @Autowired
    private StringRedisTemplate redisTemplate;
    
    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    
    @Override
    public R<List<SeckillItem>> listAllItem() {
       List<SeckillItem> items = seckillItemDao.listAllItem();
        return RUtil.setOK("ok",items);
    }

    // 查看秒杀商品详情
    @Override
    public R findById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        SeckillItem seckillItem = seckillItemDao.selectById(id);

        String md5Info = "";
        // 距离秒杀所剩时间
        long remaiTime = 0;
        // 秒杀状态 -1 未开始  0 进行中  1 已结束
        int seckillState  = 0;

        Date beginTime = seckillItem.getBeginTime();
        Date endTime = seckillItem.getEndTime();
        
        Date currentTime = new Date();
        
        long interval = beginTime.getTime() - currentTime.getTime();
        
        if (interval > 0) { // 秒杀未开始
            remaiTime = interval / 1000;
            seckillState = -1;
        } else {
            long endInterval = endTime.getTime() - currentTime.getTime();
            if (endInterval < 0) {
                seckillState = 1;
                remaiTime = -1;
            } else { // 秒杀进行中
                Integer stock = seckillItem.getStock();
                if (stock <= 0) {
                    seckillState = -1;
                    remaiTime = -1;
                } else {
                    seckillState = 0;
                    remaiTime = 0;

                    //盐值
                    String salt ="hello";
                    md5Info= MD5Utils.md5(salt+id);
                }

            }
        }
        map.put("seckillItem",seckillItem);
        map.put("remaimTime",remaiTime);
        map.put("seckillState",seckillState);
        map.put("md5Info",md5Info);
        return RUtil.setOK("ok",map);
    }

    // 进行秒杀操作
    @Override
    public R buySeckillItem(Integer id) {

        Boolean state = overMap.get("id" + id);
        if (state != null && state == true) {
            throw new RuntimeException("秒杀结束");
        }
        Long stock = redisTemplate.opsForHash().increment("stock", "id" + id, -1);
        
        if (stock >= 0) {
            synchronized (SeckillServiceImpl.class){
                Common.count++;
            }
            rabbitTemplate.convertAndSend("q_simple",id);
            
        } else {
            overMap.put("id"+id,true);
            throw new RuntimeException("秒杀结束");
        }
        return RUtil.setOK();
        
    }
}
