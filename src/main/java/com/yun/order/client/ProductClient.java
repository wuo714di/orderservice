package com.yun.order.client;

import com.yun.order.model.Product;
import com.yun.order.model.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author WXD
 * @date 2019-08-21 11:08
 * @description:  调用Product服务的工具类
 * 这个地方遇到的坑  ： 服务端提供的是一个list集合，而我这边配置的是product
 * 因而报错说Jackson解析异常 ，
 * 注意服务和客户端的实例要保持一致。
 */
@Component
public class ProductClient {
    @Autowired
    private RestTemplate restTemplate;
    public List<ProductVO> getProduct(){
      //  ResponseEntity<Product> exchange = restTemplate.exchange("http://productserverdemo/product/getProduct", HttpMethod.GET, null, Product.class);
     //   ProductVO[] forObject = restTemplate.getForObject("http://productserverdemo/product/getProduct",ProductVO[].class, HttpMethod.GET, null);
      List<ProductVO> forObject = restTemplate.getForObject("http://productserverdemo/product/getProduct",List.class, HttpMethod.GET, null);
        return forObject;
    }
}
