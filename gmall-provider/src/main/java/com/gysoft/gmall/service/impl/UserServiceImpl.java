package com.gysoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.gmall.api.UserService;
import com.gysoft.gmall.bean.UserAddress;
import java.util.List;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:12$
 */
@Service
public class UserServiceImpl   implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("hello  dubbo");
        return null;
    }
}
