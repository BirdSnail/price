package com.birdsnail.price.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.birdsnail.price.enums.CouponEnum;
import com.birdsnail.price.model.ProductParam;
import com.birdsnail.price.service.PriceService;
import com.birdsnail.price.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Map<String, PriceService> priceServiceMap;

    @Override
    public BigDecimal calculatePrice(ProductParam param) {
        BigDecimal price = selectPrice(param.getId());
        log.info("商品id={}，价格={}", param.getId(), price);
        String name = CouponEnum.getPriceServiceNameByType(param.getCouponType());
        PriceService priceService = priceServiceMap.get(name);
        if (priceService == null) {
            throw new IllegalArgumentException("折扣类型无法识别");
        }
        return priceService.calculate(price);
    }

    @Override
    public BigDecimal selectPrice(Long id) {
        return RandomUtil.randomBigDecimal(new BigDecimal("4000"), new BigDecimal("6000"));
    }


}
