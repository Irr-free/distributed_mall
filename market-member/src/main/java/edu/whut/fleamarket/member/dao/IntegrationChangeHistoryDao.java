package edu.whut.fleamarket.member.dao;

import edu.whut.fleamarket.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:32:35
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
