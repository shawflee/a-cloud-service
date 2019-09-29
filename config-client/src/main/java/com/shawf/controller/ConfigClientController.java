package com.shawf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawf_lee
 * @date 2019/9/29 14:36
 * Content:
 */
@RestController
@RequestMapping("/config")
public class ConfigClientController {

    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @RequestMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
