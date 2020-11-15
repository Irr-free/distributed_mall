package edu.whut.fleamarket.ware.dao;

import edu.whut.fleamarket.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:42:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
