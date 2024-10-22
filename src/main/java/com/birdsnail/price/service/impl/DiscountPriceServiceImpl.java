package com.birdsnail.price.service.impl;

import com.birdsnail.price.service.PriceService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 折扣优惠
 */
@Service
public class DiscountPriceServiceImpl implements PriceService {

    // 可查询配置
    private BigDecimal discountRate = new BigDecimal("0.9");

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(discountRate);
    }

}
