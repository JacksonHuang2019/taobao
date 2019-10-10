package com.ccic.taobao.config;

/**
 * @Author :hzs
 * @Date :Created in 17:12 2019/9/16
 * @Description :
 * Modified By   :
 * @Version ：
 **/

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
