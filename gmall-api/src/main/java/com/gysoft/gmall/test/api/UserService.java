package com.gysoft.gmall.test.api;

import com.gysoft.gmall.test.bean.UserAddress;

import java.util.List;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/8/20 15:41
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}