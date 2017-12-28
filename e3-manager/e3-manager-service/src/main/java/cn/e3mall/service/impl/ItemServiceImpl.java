package cn.e3mall.service.impl;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zxy on 2017/12/28.
 */
@Service
public class ItemServiceImpl implements ItemService {


    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
      //  TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        TbItem tbItems = tbItemMapper.selectByExample(example).get(0);
        return tbItems;
    }
}
