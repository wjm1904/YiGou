package com.qfedu.wy.seckill.controller;


import com.qf.common.util.MD5Utils;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.qfedu.wy.seckill.entity.SeckillItem;
import com.qfedu.wy.seckill.service.SeckillItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    11:23
 */
@Controller
@Api(value = "商品描述",tags = "商品")
public class SeckillController {
    
    @Autowired
    private SeckillItemService seckillItemService;

    /**
     * wy
     * 查询单个商品信息
     * @param id    商品id
     * @return  seckillItem
     */
    @ApiOperation(value = "查询单个商品",notes = "查询单个商品")
    @GetMapping("/controller/seckill/findById.do")
    @ResponseBody
    public R findById(@RequestParam("id") Integer id) {
        return seckillItemService.findById(id);
    }

    /**
     * wy
     * 查询所有秒杀商品
     * @return List<SeckillItem>
     */
    @ApiOperation(value = "查询所有商品",notes = "查询所有商品")
    @GetMapping("/controller/seckill/findAllItem.do")
    @ResponseBody
    public R findAllItem() {
        return seckillItemService.listAllItem();
    }
    
    /**
     * wy
     * 进行秒杀
     * @param id
     * @return
     */
    @ApiOperation(value = "进行秒杀操作",notes = "秒杀商品")
    @PostMapping("/controller/seckill/buySeckillItem.do")
    public String  buySeckillItem(Integer id) {
       
        seckillItemService.buySeckillItem(id);
        return "orderDetail";
        
    }
}
