package edu.whut.fleamarket.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.whut.common.utils.PageUtils;
import edu.whut.fleamarket.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author it_Irr
 * @email 1569173417@qq.com
 * @date 2020-11-11 00:23:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

