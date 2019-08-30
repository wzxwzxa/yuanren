package com.service.impl;

import com.dao.IintermediateTableDao;
import com.dao.IotherPubDao;
import com.model.IntermediateTable;
import com.model.OtherPub;
import com.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现service测试接口
 * @author dell
 * @date 2019-08-28 14:11
 */
@Service
public class testServiceImpl implements testService {

    @Autowired
    private IintermediateTableDao iintermediateTableDao;
    @Autowired
    private IotherPubDao iotherPubdao;

    @Override
    public List<IntermediateTable> seletAll() {
        return iintermediateTableDao.findAll();
    }

    @Override
    public List<OtherPub> selectAll() {
        List<OtherPub> all = iotherPubdao.findAll();
        for (OtherPub otherPub : all) {
            System.out.println(otherPub);
        }
        return all;
    }
}
