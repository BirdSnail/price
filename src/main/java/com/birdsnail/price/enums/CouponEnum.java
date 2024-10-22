package com.birdsnail.price.enums;

import lombok.Getter;

public enum CouponEnum {

    discount(1, "discountPriceServiceImpl"),
    reduce(2, "reducePriceServiceImpl"),

    ;

    private int type;

    @Getter
    private String priceServiceName;


    CouponEnum(int type, String priceServiceName) {
        this.type = type;
        this.priceServiceName = priceServiceName;
    }

    public static String getPriceServiceNameByType(int type) {
        for (CouponEnum couponEnum : values()) {
            if (couponEnum.type == type) {
                return couponEnum.getPriceServiceName();
            }
        }
        return null;
    }

}
