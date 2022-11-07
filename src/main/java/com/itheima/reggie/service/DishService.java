package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    //新增菜品，同时加入菜品对应的口味数据，需要操作两张表Dish，Dish_Flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应口味信息
    public void updateWithFlavor(DishDto dishDto);

    //删除菜品信息和关联的套餐信息
    public void deleteWithSetmeal(List<Long> ids);
}
