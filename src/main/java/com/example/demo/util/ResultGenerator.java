package com.example.demo.util;


import com.example.demo.enums.ResultCode;
import com.example.demo.model.Result;

/**
 * @author V
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }

    public static <T> Result<T> genSuccessResult(String message, T data){
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(message)
                .setData(data);
    }
    public static <T> Result<T> build(ResultCode code, String message, T data){
        return new Result()
                .setCode(code)
                .setMessage(message)
                .setData(data);
    }
}
