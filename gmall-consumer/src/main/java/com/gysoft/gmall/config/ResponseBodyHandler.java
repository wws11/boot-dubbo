package com.gysoft.gmall.config;

import com.gysoft.gmall.config.result.ResponseResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author 魏文思
 * @date 2019/11/7$ 15:38$
 */
@ControllerAdvice(basePackages = "com.gysoft")
public class ResponseBodyHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        //不为空别且不是字符串
        if (null == body && !selectedConverterType.equals(StringHttpMessageConverter.class)) {
            return ResponseResult.success();
        }
        //这个是对字符串的特殊处理  响应字符串的话会出现 ava.lang.ClassCastException: com.gysoft.gmall.config.result.ResponseResult cannot be cast to java.lang.String
        //解决这个问题字符串特殊处理
        if (selectedConverterType.equals(StringHttpMessageConverter.class)) {
            return ResponseResult.buildSuccessResultStr(body);
        }
        //返回的是ResponseResult原型或者是byte类型的直接返回 byte 会报错java.lang.ClassCastException: com.gysoft.gmall.config.result.ResponseResult cannot be cast to [B
        if(body.getClass().equals(ResponseResult.class)||body.getClass().equals(byte[].class)) {
            return body;
        }
        return ResponseResult.success(body);
    }
}
