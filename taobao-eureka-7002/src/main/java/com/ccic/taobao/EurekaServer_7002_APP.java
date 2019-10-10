package com.ccic.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author :hzs
 * @Date :Created in 14:51 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7002_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002_APP.class, args);
    }

}
