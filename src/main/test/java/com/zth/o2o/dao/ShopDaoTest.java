package com.zth.o2o.dao;

import com.zth.o2o.BasicTest;
import com.zth.o2o.entity.Area;
import com.zth.o2o.entity.PersonInfo;
import com.zth.o2o.entity.Shop;
import com.zth.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Author: 3zZ.
 * Date: 2019/9/29 7:16 下午
 */
public class ShopDaoTest extends BasicTest {
    @Autowired
    private ShopDao shopDao;
    @Test
    @Ignore
    public void testInsertShop(){
        Shop shop = new Shop();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        PersonInfo owner = new PersonInfo();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwnerId(1L);
        shop.setArea(area);
        shop.setOwner(owner);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1,effectedNum);
    }
    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(2L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        shop.setLastEditTime(new Date());
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1,effectedNum);
    }
}
