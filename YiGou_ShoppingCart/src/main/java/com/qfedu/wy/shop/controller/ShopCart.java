package com.qfedu.wy.shop.controller;

import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import com.qfedu.wy.shop.entity.ShoppingCart;
import com.qfedu.wy.shop.service.ShoppingCartService;
import com.qfedu.wy.shop.util.GetIds;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by   Intellif Idea 2019.09
 * Author:  Wang Yun
 * Date:    2019-09-21
 * Time:    23:23
 */
@Api(value = "购物车",tags = "购物车")
@RestController
public class ShopCart {
    
    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * wy
     * 简单添加购物车，添加商品id，用户id
     * 目前用户id还没添加
     * @param id
     * @return
     */
    @ApiOperation(value = "添加购物车",notes = "添加购物车")
    @PostMapping("/controller/shopCart/addItem.do")
    public R addItem(@RequestParam("id") Integer id) {
        return shoppingCartService.addItemById(id);
    }
    
    @ApiOperation(value = "查询指定用户属于购物车商品",notes = "查询指定用户属于购物车商品")
    @GetMapping("/controller/shopCart/findItemByUid.do")
    public R findItemByUid(@RequestParam("id") Integer id) {
        return RUtil.setOK("ok",shoppingCartService.findItemByUid(id));
    }
    
    @ApiOperation(value = "查询单个商品" ,notes = "查询单个商品")
    @GetMapping("/controller/shopCart/findInfoByItemId.do")
    public R findInfoByItemId(@RequestParam("id") Integer id) {
        return RUtil.setOK("ok",shoppingCartService.findInfoByItemId(id));
    }
    
    @ApiOperation(value = "删除购物车指定商品",notes = "删除购物车指定商品")
    @DeleteMapping("/controller/shopCart/delItemById.do")
    public R delItemById(@RequestParam("itemId") Integer itemId) {
        return RUtil.setR(shoppingCartService.delItemById(itemId) > 0,"ok");
    }

    /**
     * wy
     * 批量删除，需要结合layui使用才能测试
     * @param ids
     * @return
     */
    @ApiOperation(value = "批量删除购物车商品信息",notes = "批量删除购物车商品信息")
    @DeleteMapping("/controller/shopCart/delBatch.do")
    public R delBatch(@RequestParam("ids") GetIds ids) {
        shoppingCartService.delBatch(ids.getIds());
        return RUtil.setOK();
    }
}
