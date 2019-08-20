package com.gysoft.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:14$
 */
@DubboComponentScan(basePackages = "com.gysoft.gmall.service.impl")
@SpringBootApplication()
@EnableDubbo
public class DubboProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProducerApplication.class, args);
    }
}
