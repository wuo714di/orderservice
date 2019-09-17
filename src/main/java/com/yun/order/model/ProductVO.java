package com.yun.order.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WXD
 * @date 2019-08-19 14:20
 * @description:
 */
@Data
public class ProductVO implements Serializable {
    private Long id;
    private String productCode;
    private String productName;
    private String description;
    private Float price;
}
