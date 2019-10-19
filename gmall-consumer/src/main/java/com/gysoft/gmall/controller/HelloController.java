package com.gysoft.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gysoft.gmall.test.api.UserService;
import com.gysoft.gmall.test.bean.UserAddress;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.Collator;
import java.util.*;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:31$
 */
@RestController
public class HelloController {
    @Reference
    private UserService userService;
    @GetMapping("/hello/{userId}")
    @ApiOperation(value = "测试dubbo服务环境", notes = "测试dubbo服务环境", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserAddress>  getUserAdress(@PathVariable String userId){
        List<UserAddress> userAddresses = userService.getUserAddressList("userId");
        return userAddresses;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10号楼", "1地下室", "1号楼", "5号楼", "8号楼", "7号楼", "6号楼", "9号楼","11号楼", "测试","aaa","嘿嘿","10单元","bbb");
        Collections.sort(list, (o1, o2) -> {
            int flag = o1.length() - o2.length();
            if(flag==0){
                Collator instance = Collator.getInstance(Locale.CHINA);
                flag = instance.compare(o1, o2);
            }
            return  flag;

        });
        System.out.println(list);
    }

}

