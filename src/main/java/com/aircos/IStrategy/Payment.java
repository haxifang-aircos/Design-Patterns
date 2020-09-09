package com.aircos.IStrategy;

import com.aircos.MsgResult;

/**
 * 支付渠道
 */
public abstract class Payment {

    public abstract String getName();

    // 通用逻辑被放到抽象类里实现
    public MsgResult pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额：" + amount);
    }

    protected abstract double queryBalance(String uid);

}
