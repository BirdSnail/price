package com.birdsnail.price.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 商品
 */
@Data
public class ProductParam {

    /**
     * 商品id
     */
    @NotNull(message = "商品id不能为空")
    private Long id;

    /**
     * 优惠券类型
     */
    @NotNull(message = "优惠券类型不能为空")
    private Integer couponType;

}