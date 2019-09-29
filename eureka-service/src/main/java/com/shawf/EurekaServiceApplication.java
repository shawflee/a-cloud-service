package com.shawf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shawf_lee
 * @date 2019/9/27 9:51
 * Content:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication{
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}
