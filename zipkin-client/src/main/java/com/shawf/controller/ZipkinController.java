package com.shawf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawf_lee
 * @date 2019/9/29 16:40
 * Content:
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
