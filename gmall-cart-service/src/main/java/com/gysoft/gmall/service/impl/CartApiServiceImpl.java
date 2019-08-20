package com.gysoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.gmall.cart.api.CartApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @author 魏文思
 * @date 2019/8/20$ 15:35$
 */
@Service
public class CartApiServiceImpl  implements CartApiService {
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public void test() {
        System.out.println("cart  success ！！！");
        //这里相当于redis对String类型的set操作
        redisTemplate.opsForValue().set("test","helloworld");
        //这里相当于redis对String类型的get操作
        String test = (String)redisTemplate.opsForValue().get("test");
        System.out.println(test);
    }
}
