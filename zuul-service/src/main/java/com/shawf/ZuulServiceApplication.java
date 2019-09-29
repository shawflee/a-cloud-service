package com.shawf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author shawf_lee
 * @date 2019/9/27 15:39
 * Content:
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class,args);
    }
}
