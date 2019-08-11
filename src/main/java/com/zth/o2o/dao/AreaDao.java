package com.zth.o2o.dao;

import com.zth.o2o.entity.Area;

import java.util.List;

/**
 * Author: 3zZ.
 * Date: 2019-08-11 22:06
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
