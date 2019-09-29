package com.shawf.controller;

import com.shawf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author shawf_lee
 * @date 2019/9/27 16:57
 * Content:
 */
@RestController
@RequestMapping("/ribbon")
public class RinbbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping("index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
