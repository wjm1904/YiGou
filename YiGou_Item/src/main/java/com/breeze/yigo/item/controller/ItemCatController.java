package com.breeze.yigo.item.controller;


import com.breeze.yigo.item.entity.ItemCat;
import com.breeze.yigo.item.service.ItemCatService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "商品类目表的操作")
public class ItemCatController {
    @Autowired
    ItemCatService itemCatService;
    @GetMapping("/nolog/provider/itemcat/queryparent.do")
    public R queryParent(){
        return itemCatService.queryParent();
    }

    @GetMapping("/nolog/provider/itemcat/querychild.do")
    public R queryChild(@RequestParam int id){
        return itemCatService.queryChild(id);
    }

    @PostMapping("/admin/itemcat/insert.do")
    public R insert(@RequestBody ItemCat itemCat){
        itemCatService.save(itemCat);
        return RUtil.setOK("添加类目成功");
    }

    @DeleteMapping("/admin/itemcat/delete.do")
    public R delete(@RequestParam int id){
        itemCatService.removeById(id);
        return RUtil.setOK("删除类目成功");
    }


}
