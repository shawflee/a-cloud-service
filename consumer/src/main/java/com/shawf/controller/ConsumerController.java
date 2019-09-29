package com.shawf.controller;


import com.shawf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;


/**
 * @author shawf_lee
 * @date 2019/9/27 14:02
 * Content:
 */

@RestController
@RequestMapping("/rest")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity
                ("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject
                ("http://localhost:8010/student/findAll",Collection.class);
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForObject
                ("http://localhost:8010/student/findById/{id}",Student.class,id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject
                ("http://localhost:8010/student/save",student,String.class);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put
                ("http://localhost:8010/student/update",student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
}
