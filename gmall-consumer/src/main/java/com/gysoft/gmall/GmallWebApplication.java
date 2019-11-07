package com.gysoft.gmall;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableSwagger2Doc
public class GmallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallWebApplication.class, args);
    }
}
