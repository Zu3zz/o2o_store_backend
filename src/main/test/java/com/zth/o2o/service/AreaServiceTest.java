package com.zth.o2o.service;

import com.zth.o2o.BasicTest;
import com.zth.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Author: 3zZ.
 * Date: 2019-08-16 22:31
 */
public class AreaServiceTest extends BasicTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("塔院",areaList.get(1).getAreaName());
    }
}
