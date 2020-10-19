package com.shawf.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @author shawf_lee
 * @date 2020/10/16 16:33
 *Content:
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig implements AsyncConfigurer{

//    @Value("${spring.thread.poolsize}")
//    private int poolSize; //读取配置文件中的参数

    @Override
    public Executor getAsyncExecutor() {
        //定义线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //核心线程数
        taskExecutor.setCorePoolSize(20);
        //线程池最大线程数
        taskExecutor.setMaxPoolSize(100);
        //线程队列最大线程数
        taskExecutor.setQueueCapacity(10);
        //初始化
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
