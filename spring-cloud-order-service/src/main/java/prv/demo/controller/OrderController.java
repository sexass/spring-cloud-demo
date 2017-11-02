package prv.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prv.demo.service.OrderService;

/**
 * 订单controller
 *
 * @author 郭友文
 * @create 2017-11-02 9:27
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String get(@PathVariable Long id){
        Gson gson=new Gson();
        return gson.toJson(orderService.findById(id));
    }
}
