package prv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prv.demo.entity.ItemModel;
import prv.demo.service.ItemService;

/**
 * 商品controller
 *
 * @author 郭友文
 * @create 2017-10-27 20:01
 **/
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/{id}")
    public ItemModel findById(@PathVariable Long id){
        return itemService.findOne(id);
    }
}
