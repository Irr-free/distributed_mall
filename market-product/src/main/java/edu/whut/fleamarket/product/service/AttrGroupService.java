package edu.whut.fleamarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-11 00:23:50
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

