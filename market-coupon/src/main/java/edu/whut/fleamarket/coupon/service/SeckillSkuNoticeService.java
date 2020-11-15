package edu.whut.fleamarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:46:27
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

