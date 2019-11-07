package com.gysoft.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gysoft.gmall.test.api.UserService;
import com.gysoft.gmall.test.bean.UserAddress;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:31$
 */
@RestController
public class HelloController {
   /* @Reference
    private UserService userService;

    @GetMapping("/hello/{userId}")
    @ApiOperation(value = "测试dubbo服务环境", notes = "测试dubbo服务环境", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserAddress> getUserAdress(@PathVariable String userId) {
        List<UserAddress> userAddresses = userService.getUserAddressList("userId");
        return userAddresses;
    }*/

    @GetMapping("/testControllerAdvice")
    @ApiOperation(value = "测试响应拦截器的使用", notes = "测试响应拦截器的使用", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserAddress> testControllerAdvice() {
        List<UserAddress> result = new ArrayList<>();
        UserAddress userAddresses = new UserAddress();
        userAddresses.setUserId("dddddf");
        userAddresses.setPhoneNum("sfsfw34534");
        UserAddress userAddresses2 = new UserAddress();
        userAddresses2.setUserId("dddddf");
        userAddresses2.setPhoneNum("sfsfw34534");
        result.add(userAddresses);
        result.add(userAddresses2);
        return result;
    }


    @GetMapping("/testResponseString")
    @ApiOperation(value = "测试响应字符串信息", notes = "测试响应字符串信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testResponseString() {

        return "ok";
    }

    @GetMapping("/testResponseByte")
    @ApiOperation(value = "测试响应字符串信息", notes = "测试响应字符串信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public byte[] testResponseByte() {
        byte[] aa = new byte[10];
        aa[0] = 1;
        aa[1]=2;
        return aa;
    }
}

