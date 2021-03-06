package edu.whut.fleamarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:42:19
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

