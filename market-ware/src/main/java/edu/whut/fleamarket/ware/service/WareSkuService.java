package edu.whut.fleamarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:42:20
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

