package com.birdsnail.price.service;

import com.birdsnail.price.model.ProductParam;

import java.math.BigDecimal;

public interface ProductService {

    /**
     * 计算最终价格
     */
    BigDecimal calculatePrice(ProductParam param);

    /**
     * 查询商品价格
     */
    BigDecimal selectPrice(Long id);
}
