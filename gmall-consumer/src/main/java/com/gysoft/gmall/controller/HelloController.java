package com.gysoft.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gysoft.gmall.api.UserService;
import com.gysoft.gmall.bean.UserAddress;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:31$
 */
@RestController
public class HelloController {
    @Reference
    private UserService  userService;
    @GetMapping("/hello/{userId}")
    @ApiOperation(value = "测试dubbo服务环境", notes = "测试dubbo服务环境", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserAddress>  getUserAdress(@PathVariable String userId){
        List<UserAddress> ssffsfs = userService.getUserAddressList("userId");
        return ssffsfs;
    }
}
