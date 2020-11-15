package edu.whut.fleamarket.coupon.dao;

import edu.whut.fleamarket.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:46:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
