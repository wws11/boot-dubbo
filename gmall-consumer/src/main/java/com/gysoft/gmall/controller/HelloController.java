package com.gysoft.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gysoft.gmall.api.UserService;
import com.gysoft.gmall.bean.UserAddress;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/hello")

    public String  getUserAdress(){
        List<UserAddress> ssffsfs = userService.getUserAddressList("ssffsfs");
        return "ok";
    }
}
