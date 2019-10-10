package com.ccic.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author :hzs
 * @Date :Created in 17:16 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_8088_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8088_APP.class, args);
    }
}
