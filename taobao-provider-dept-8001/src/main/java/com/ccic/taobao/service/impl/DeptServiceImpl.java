package com.ccic.taobao.service.impl;

import com.ccic.taobao.dao.DeptDao;
import com.ccic.taobao.entity.Dept;
import com.ccic.taobao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :hzs
 * @Date :Created in 9:36 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return this.deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return this.deptDao.findAll();
    }
}
