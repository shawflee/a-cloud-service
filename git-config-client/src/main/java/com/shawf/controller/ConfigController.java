package com.shawf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawf_lee
 * @date 2019/9/29 15:58
 * Content:
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/index")
    public String index(){
        return this.port+"+++"+this.name;
    }
}
