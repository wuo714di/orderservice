package com.yun.order.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changqing
 * @date 2019-09-17 10:18
 * @description: 配置全局的异常捕捉处理
 */
@RestControllerAdvice  //该注解是不用任何配置，该类能够实现全局的异常调动
public class ExceptionConfig {
    @ExceptionHandler(value = Exception.class)
    public Map exceptionHandler(Exception e) {
        Map exception = new HashMap();
    exception.put("code","0");
    exception.put("message",e.getMessage());
    return exception;
    }
}
