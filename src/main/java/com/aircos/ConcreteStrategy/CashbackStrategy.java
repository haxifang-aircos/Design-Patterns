package com.aircos.ConcreteStrategy;

import com.aircos.IStrategy.IPromotionStrategy;

/**
 * 返现促销策略
 */
public class CashbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现, 直接打款到支付宝账号");
    }
}
