package prv.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 订单项
 *
 * @author 郭友文
 * @create 2017-11-02 9:29
 **/
@Entity
@Table(name = "ms_order_item")
public class OrderItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "item_id")
    private Long itemId;
    @Column(name="order_id")
    private Long orderId;
    @Column(name = "order_number")
    private Integer orderNumber;
    @Column(name = "create_time")
    private LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
}
