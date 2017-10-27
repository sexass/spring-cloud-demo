package prv.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prv.demo.dao.IItemDao;
import prv.demo.entity.ItemModel;

/**
 * 商品service
 *
 * @author 郭友文
 * @create 2017-10-26 17:57
 **/
@Service
public class ItemService {
    @Autowired
    private IItemDao itemDao;

    public ItemModel findOne(Long id){
        return itemDao.findOne(id);
    }
}
