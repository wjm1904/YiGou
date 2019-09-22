package com.breeze.yigo.item.controller;

        import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
        import com.baomidou.mybatisplus.core.metadata.IPage;
        import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
        import com.breeze.yigo.item.entity.Item;
        import com.breeze.yigo.item.service.ItemService;
        import com.qf.common.util.RUtil;
        import com.qf.common.vo.R;
        import io.swagger.annotations.Api;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "商品表的操作")
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/nolog/provider/item/queryitembycid.do")
    public R selectItemByCid(@RequestParam Long cid, int current, int size){
        IPage<Item> page = itemService.page(new Page<>(current, size), new QueryWrapper<Item>().lambda()
                .eq(Item::getStatus, 1)
                .eq(Item::getCid, cid)
        );
        return RUtil.setOK("查询商品成功",page);
    }
}
