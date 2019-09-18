package com.yun.order.client;

import com.yun.order.model.ProductVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;
import java.util.List;

/**
 * @author changqing
 * @date 2019-09-17 18:42
 * @description:  字典服务，消费product暴漏的接口
 * @FeignClient的两种使用方式，现在这种是produceservice是在注册中心注册的名字
 * 另外中是produceservice的服务项目开发跨域请求暴露给订单项目使用
 */
//@FeignClient(value = "produceservice",path = "/product")
   // @FeignClient(value = "productService",url = "127.0.0.1:8015/product")
public interface ProductsClient {
    @RequestMapping(value = "/getProduct",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductVO> getProduct();

}
