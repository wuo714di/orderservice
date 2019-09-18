package com.yun.order.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Function;

/**
 * @author changqing
 * @date 2019-09-18 11:38
 * @description: 函数式接口，还有BiFunction
 */
@Component
public class FunctionCompute {

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }
}
