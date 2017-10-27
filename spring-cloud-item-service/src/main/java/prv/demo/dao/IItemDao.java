package prv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import prv.demo.entity.ItemModel;

/**
 * 商品dao
 *
 * @author 郭友文
 * @create 2017-10-26 17:56
 **/
public interface IItemDao extends JpaRepository<ItemModel,Long>{
}
