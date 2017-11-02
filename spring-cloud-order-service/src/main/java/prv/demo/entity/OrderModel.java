package prv.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 订单
 *
 * @author 郭友文
 * @create 2017-11-02 9:29
 **/
@Entity
@Table(name = "ms_order")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "create_time")
    private LocalDateTime createTime;
    @Column(name = "total_price")
    private Integer totalPrice;

    public OrderModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
