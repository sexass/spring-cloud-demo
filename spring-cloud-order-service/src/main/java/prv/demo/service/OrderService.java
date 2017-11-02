package prv.demo.service;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import prv.demo.dao.IOrderItemSimpleDao;
import prv.demo.dao.IOrderSimpleDao;
import prv.demo.entity.*;

import java.util.List;

/**
 * 订单service
 *
 * @author 郭友文
 * @create 2017-11-02 9:41
 **/
@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    IOrderSimpleDao orderSimpleDao;
    @Autowired
    IOrderItemSimpleDao orderItemSimpleDao;

    public OrderSaveDto findById(Long id){
        OrderSaveDto result=new OrderSaveDto();
        OrderModel orderModel=orderSimpleDao.findOne(id);
        List<OrderItemModel> orderItemModelList=orderItemSimpleDao.findListByOrderId(id);
        List<OrderItemDto> orderItemDtos= Lists.newArrayList();
        Gson gson=new Gson();
        if(orderItemModelList!=null){
            for(OrderItemModel o:orderItemModelList){
                ItemModel itemModel=gson.fromJson(restTemplate.getForObject("http://item-service/item/"+o.getItemId(),String.class),ItemModel.class);
                OrderItemDto orderItemDto=new OrderItemDto();
                BeanUtils.copyProperties(o,orderItemDto);
                orderItemDto.setItemCode(itemModel.getCode());
                orderItemDto.setItemName(itemModel.getName());
                orderItemDto.setItemPrice(itemModel.getPrice().intValue());
                orderItemDtos.add(orderItemDto);
            }
        }
        result.setOrderModel(orderModel);
        result.setItemList(orderItemDtos);
        return result;
    }
}
