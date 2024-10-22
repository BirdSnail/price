package com.birdsnail.price.service;

import java.math.BigDecimal;

public interface PriceService {

    /**
     * 计算价格
     *
     * @param price 原始价格
     * @return 折扣后的价格
     */
    BigDecimal calculate(BigDecimal price);
}
