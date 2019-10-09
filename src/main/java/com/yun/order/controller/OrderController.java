package com.yun.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yun.order.client.ProductClient;
import com.yun.order.model.ProductVO;
import com.yun.order.untils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * @author WXD
 * @date 2019-08-21 11:24
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private ProductClient client;
    @Value("${spring.application.name}")
    private String appName;

    /**
     * 服务容错中的服务熔断
     *
     * @return
     * @throws Exception
     */
    @HystrixCommand(fallbackMethod = "hystrixdemo")
    @GetMapping("/getProduct")
    public ResponseUtils<List<ProductVO>> getProduct() throws Exception {
        if (1 == 1) {
            throw new Exception("实验，抛出异常");
        }
        List<ProductVO> product = client.getProduct();
        return ResponseUtils.success(product);


    }

    /**
     * 服务熔断中自身提供是友好界面的返回值要和本来的返回值一致，否则报错。
     *
     * @return
     */
    public ResponseUtils<List<ProductVO>> hystrixdemo() {

        ResponseUtils response = new ResponseUtils();
        response.setCode(1);
        response.setData(null);
        response.setAppName(appName);
        return response;
    }
}
