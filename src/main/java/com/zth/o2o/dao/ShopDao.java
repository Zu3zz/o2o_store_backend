package com.zth.o2o.dao;

import com.zth.o2o.entity.Shop;

/**
 * Author: 3zZ.
 * Date: 2019/9/29 6:43 下午
 */
public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新商铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
