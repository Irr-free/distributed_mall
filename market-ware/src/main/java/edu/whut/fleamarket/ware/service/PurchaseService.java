package edu.whut.fleamarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-13 18:42:20
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

