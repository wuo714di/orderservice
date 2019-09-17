package com.yun.order.untils;

/**
 * @author WXD
 * @date 2019-08-22 11:04
 * @description:
 */
public enum  RespCodeUtils {
    SUCCESS(0, "成功!"),
    EXCEPTION(1, "处理发生异常"),
    ERROR(2, "服务暂不可用");

    private final int code;
    private final String message;

    RespCodeUtils(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}

