package com.zth.o2o.service.impl;

import com.zth.o2o.dao.AreaDao;
import com.zth.o2o.entity.Area;
import com.zth.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: 3zZ.
 * Date: 2019-08-16 22:16
 */

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList(){
        return areaDao.queryArea();
    }
}
