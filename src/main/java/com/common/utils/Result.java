package com.common.utils;

/**
 * 定义同意返回
 *
 * @author dell
 * @date 2019-08-30 14:17
 */
@lombok.Data
public class Result {
    private int code;
    private String msg;
    private Data data;

    public Result(int code, String msg, Data data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(int code,String msg,String message){

    }
}
