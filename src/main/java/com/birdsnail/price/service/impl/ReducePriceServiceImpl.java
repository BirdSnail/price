package com.birdsnail.price.service.impl;

import com.birdsnail.price.service.PriceService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 满减优惠
 */
@Service
public class ReducePriceServiceImpl implements PriceService {

    // 可实时查询
    // 满减基数
    private BigDecimal base = new BigDecimal("5000");

    // 满减金额
    private BigDecimal reductionAmount = new BigDecimal("100");

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.compareTo(base) >= 0
                ? price.subtract(reductionAmount)
                : price;
    }
}
