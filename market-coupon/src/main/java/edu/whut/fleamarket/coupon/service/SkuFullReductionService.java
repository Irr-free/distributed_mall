package edu.whut.fleamarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:46:27
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

