package com.gysoft.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gysoft.gmall.cart.api.CartApiService;
import com.gysoft.gmall.dao.SkuDao;
import com.gysoft.gmall.pojo.Sku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @author 魏文思
 * @date 2019/8/20$ 15:35$
 */
@Service
public class CartApiServiceImpl implements CartApiService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private SkuDao skuDao;

    @Override
    public void test() {
        System.out.println("cart  success ！！！");
        //这里相当于redis对String类型的set操作
        redisTemplate.opsForValue().set("test", "helloworld");
        //这里相当于redis对String类型的get操作
        String test = (String) redisTemplate.opsForValue().get("test");
        System.out.println(test);
        Sku sku = skuDao.getSku(1);
        System.out.println(sku);
    }


    /**
     * 1、用户未登录状态下，用户添加购物车，首先从cookie中查询购物车中的商品列表
     *
     * 2、 判断cookie的商品列表中是否有要添加的商品信息
     *
     * 3、如果cookie中有该商品信息，将商品的数量相加
     *
     * 4、如果没有，根据商品的id值查询商品信息
     *
     * 5、将商品添加到购物车列表中
     *
     * 6、将购物车列表写入cookie中，设置cookie的过期时间
     *
     * 7、将cookie返回给客户端
     */


    public   void  addToCart(){
        if(1==1){
            //用户登录了
        }else{
            //用户没有登录
        //查询购物车的商品列表
        }

    }
}
