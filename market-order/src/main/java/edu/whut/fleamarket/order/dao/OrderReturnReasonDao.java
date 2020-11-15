package edu.whut.fleamarket.order.dao;

import edu.whut.fleamarket.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:39:43
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
