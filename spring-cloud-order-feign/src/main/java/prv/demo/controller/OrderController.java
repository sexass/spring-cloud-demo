package prv.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import prv.demo.service.OrderService;

/**
 * @Author:郭友文
 * @Data:2018/6/5 10:58
 * @Description:
 */
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
