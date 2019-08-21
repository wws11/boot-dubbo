package com.gysoft.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:14$
 */

@SpringBootApplication
@EnableDubbo
@MapperScan("com.gysoft.gmall.dao")
public class DubboCartServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboCartServiceApplication.class, args);
    }
}
