package prv.demo.entity;

import java.util.List;

/**
 * 订单保存dto
 *
 * @author 郭友文
 * @create 2017-11-02 9:43
 **/
public class OrderSaveDto {
    private OrderModel orderModel;
    private List<OrderItemDto> itemList;

    public OrderSaveDto() {
    }

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

    public List<OrderItemDto> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItemDto> itemList) {
        this.itemList = itemList;
    }
}
