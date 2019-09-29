package com.shawf.feign.impl;

import com.shawf.entity.Student;
import com.shawf.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author shawf_lee
 * @date 2019/9/27 17:47
 * Content:
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
