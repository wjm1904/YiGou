package com.qfedu.wy.seckill.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.common.vo.R;
import com.qfedu.wy.seckill.entity.SeckillItem;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    11:16
 */
public interface SeckillItemDao extends BaseMapper<SeckillItem> {
    List<SeckillItem> listAllItem();
    
    void updateStock(Integer id);
}
