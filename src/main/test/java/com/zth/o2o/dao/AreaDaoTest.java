package com.zth.o2o.dao;

import com.zth.o2o.BasicTest;
import com.zth.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Author: 3zZ.
 * Date: 2019-08-11 22:33
 */
public class AreaDaoTest extends BasicTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
