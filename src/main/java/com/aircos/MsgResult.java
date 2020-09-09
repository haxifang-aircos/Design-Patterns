package com.aircos;

/**
 * 支付完成以后的状态
 */
public class MsgResult {
    private int code;

    private String msg;

    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
