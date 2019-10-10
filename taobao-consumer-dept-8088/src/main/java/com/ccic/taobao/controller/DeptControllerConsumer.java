package com.ccic.taobao.controller;

import com.ccic.taobao.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author :hzs
 * @Date :Created in 17:14 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@RestController
public class DeptControllerConsumer {
//    private static final String URL_PREFIX = "http://localhost:8001";
    private static final String URL_PREFIX = "http://TAOBAO-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/dept/add", dept, Boolean.class);
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_PREFIX + "/dept/get/" + id, Dept.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List list() {
        return restTemplate.getForObject(URL_PREFIX + "/dept/list", List.class);
    }


    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(URL_PREFIX + "/dept/discovery", Object.class);
    }

}
