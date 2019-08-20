package com.gysoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.gmall.cart.api.CartApiService;

/**
 * @author 魏文思
 * @date 2019/8/20$ 15:35$
 */
@Service
public class CartApiServiceImpl  implements CartApiService {
    @Override
    public void test() {
        System.out.println("cart  success ！！！");
    }
}
