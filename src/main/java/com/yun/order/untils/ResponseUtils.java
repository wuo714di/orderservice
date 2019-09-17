package com.yun.order.untils;

import java.io.Serializable;

/**
 * @author WXD
 * @date 2019-08-22 10:57
 * @descriptRespCodeUtilsion:
 */

public class ResponseUtils<T> implements Serializable {
    private static final long serialVersionUID = -6952246743622826954L;

    private int code;
    private String message;
    private String appName;
     private T data;

    public ResponseUtils() {
    }

    public ResponseUtils(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseUtils(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseUtils<T> success(T data){
        return new ResponseUtils(RespCodeUtils.SUCCESS.code(), RespCodeUtils.SUCCESS.message(), data);
    }

    public static <T> ResponseUtils<T> success(){
        return new ResponseUtils(RespCodeUtils.SUCCESS.code(), RespCodeUtils.SUCCESS.message());
    }

    public static <T> ResponseUtils<T>  error(String msg){
        return new ResponseUtils(RespCodeUtils.ERROR.code(), msg);
    }

    public boolean isSuccess(){
        return RespCodeUtils.SUCCESS.code() == this.code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getAppName() {
        return appName;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setData(T data) {
        this.data = data;
    }
}

