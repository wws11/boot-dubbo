package com.gysoft.gmall;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//

/**
 * 如果不排除数据源的连接 会报如下错误
 * ***************************
 * APPLICATION FAILED TO START
 * ***************************
 *
 * Description:
 *
 * Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
 *
 * Reason: Failed to determine a suitable driver class
 *
 *
 * Action:
 *
 * Consider the following:
 * 	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
 * 	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableSwagger2Doc
public class GmallCartWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCartWebApplication.class, args);
    }
}
