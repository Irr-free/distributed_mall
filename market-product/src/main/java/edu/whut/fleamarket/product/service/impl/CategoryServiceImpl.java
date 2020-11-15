package edu.whut.fleamarket.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.whut.common.utils.PageUtils;
import edu.whut.common.utils.Query;

import edu.whut.fleamarket.product.dao.CategoryDao;
import edu.whut.fleamarket.product.entity.CategoryEntity;
import edu.whut.fleamarket.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listAsTree() {
        //1.查出所有的分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        //2.组装成树形结构
        List<CategoryEntity> Level1Menus = categoryEntities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(menu -> {
            menu.setChildren(getChildren(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null? 0 : menu1.getSort()) - (menu2.getSort() == null? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return Level1Menus;
    }
    private List<CategoryEntity> getChildren(CategoryEntity cur, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == cur.getCatId();
        }).map(menu -> {
            menu.setChildren(getChildren(menu,all));
            return menu;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null? 0 : menu1.getSort()) - (menu2.getSort() == null? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}