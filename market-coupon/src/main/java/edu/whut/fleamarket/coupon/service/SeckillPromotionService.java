package edu.whut.fleamarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:46:28
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

