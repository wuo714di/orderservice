package com.yun.order.Tranform;

import com.yun.order.model.Product;
import com.yun.order.model.ProductVO;

/**
 * @author changqing
 * @date 2019-09-17 15:57
 * @description: 转换类使用泛型
 * T 继承了Product VO ，因此该泛型类有了ProductVO的属性，
 * 也就是可以代表了Product VO
 *
 */
public class ProductTranform {
    public static  <T extends ProductVO> T  priductTranformProductVO(Product product,Class<T> clz){
        if (null ==product){
            return null;
        }
        T productVO;
        try {
            productVO = clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        productVO.setDescription(product.getDescription());
        productVO.setId(product.getId());
        productVO.setPrice(product.getPrice());
        productVO.setProductCode(product.getProductCode());
        productVO.setProductName(product.getProductName());
        return productVO;

    }
}
