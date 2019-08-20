package com.gysoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.gmall.test.api.UserService;
import com.gysoft.gmall.test.bean.UserAddress;

import java.util.Collections;
import java.util.List;

/**
 * @author 魏文思
 * @date 2019/8/20$ 9:12$
 */
@Service
public class UserServiceImpl   implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setId(1);
        userAddress.setUserAddress("杭州市余杭区南苑街道");
        userAddress.setUserId("sjhkh2242mkw88234");
        userAddress.setConsignee("sfsfffsf");
        userAddress.setPhoneNum("1111111111111");
        userAddress.setIsDefault("24324244243");
        return Collections.singletonList(userAddress);
    }
}
