package edu.whut.fleamarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-11 00:23:50
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

