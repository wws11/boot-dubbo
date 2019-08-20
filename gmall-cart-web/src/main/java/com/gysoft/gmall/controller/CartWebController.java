package com.gysoft.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gysoft.gmall.cart.api.CartApiService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 魏文思
 * @date 2019/8/20$ 15:37$
 */
@RestController
public class CartWebController {
    @Reference
    private CartApiService cartApiService;

    @GetMapping("/hellocar")
    @ApiModelProperty()
    public void test() {
        cartApiService.test();
    }
}
