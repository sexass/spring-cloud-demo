package prv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import prv.demo.entity.OrderModel;

/**
 * 订单dao
 *
 * @author 郭友文
 * @create 2017-11-02 9:38
 **/
public interface IOrderSimpleDao extends JpaRepository<OrderModel,Long>{
}
