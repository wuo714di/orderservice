package com.yun.order;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WXD
 * @date 2019-08-21 10:35
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //开启对熔断机制的支持
@EnableFeignClients
public class OrderApplication {
    //创建一个RestTemplate将其添加到bean中
    @LoadBalanced   //开启负载均衡  给RestTemplate做标记，以使用LoadBalancerClient来配置它
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
