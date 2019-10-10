package com.ccic.taobao.service;

import com.ccic.taobao.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}
