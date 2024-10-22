package com.birdsnail.price.model;

import lombok.Data;

@Data
public class Response<T> {

    private int code;
    private String message;
    private T data;

    public static <R> Response<R> ok(R data) {
        Response<R> response = new Response<>();
        response.setCode(200);
        response.setMessage("ok");
        response.setData(data);
        return response;
    }

}
