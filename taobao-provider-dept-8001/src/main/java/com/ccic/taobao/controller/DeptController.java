package com.ccic.taobao.controller;

import com.ccic.taobao.entity.Dept;
import com.ccic.taobao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author :hzs
 * @Date :Created in 9:33 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;



    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }






}
