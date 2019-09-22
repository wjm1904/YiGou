package com.qfedu.wy.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.common.vo.R;
import com.qfedu.wy.seckill.entity.SeckillItem;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    11:18
 */
public interface SeckillItemService extends IService<SeckillItem> {
    R<List<SeckillItem>> listAllItem();

    R findById(Integer id);
    
    R buySeckillItem(Integer id);
}
