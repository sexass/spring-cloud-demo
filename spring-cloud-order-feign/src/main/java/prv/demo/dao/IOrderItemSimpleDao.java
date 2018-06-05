package prv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import prv.demo.entity.OrderItemModel;

import java.util.List;

/**
 * 订单项
 *
 * @author 郭友文
 * @create 2017-11-02 9:39
 **/
public interface IOrderItemSimpleDao extends JpaRepository<OrderItemModel,Long> {
    /**
     * 根据订单id获取订单项
     * @param id 订单id
     * @return
     */
    @Query("from OrderItemModel o where o.orderId=:id")
    List<OrderItemModel> findListByOrderId(@Param("id") Long id);
}
