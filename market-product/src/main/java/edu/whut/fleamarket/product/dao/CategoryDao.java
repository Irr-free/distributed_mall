package edu.whut.fleamarket.product.dao;

import edu.whut.fleamarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-11 00:23:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
