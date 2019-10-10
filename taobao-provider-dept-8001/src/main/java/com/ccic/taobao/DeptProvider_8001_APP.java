package com.ccic.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author :hzs
 * @Date :Created in 9:48 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@EnableEurekaClient
@SpringBootApplication
public class DeptProvider_8001_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001_APP.class, args);
    }
}
