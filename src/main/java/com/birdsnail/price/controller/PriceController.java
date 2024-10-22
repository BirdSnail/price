package com.birdsnail.price.controller;

import com.birdsnail.price.model.ProductParam;
import com.birdsnail.price.model.Response;
import com.birdsnail.price.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RequestMapping("/product")
@RestController
@Slf4j
public class PriceController {

    @Autowired
    private ProductService productService;


    @PostMapping("/price")
    public Response<BigDecimal> price(@Validated @RequestBody ProductParam productParam) {
        BigDecimal finalPrice = productService.calculatePrice(productParam);
        return Response.ok(finalPrice);
    }
}
