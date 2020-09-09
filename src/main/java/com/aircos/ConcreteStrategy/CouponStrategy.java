package com.aircos.ConcreteStrategy;

import com.aircos.IStrategy.IPromotionStrategy;

/**
 * 优惠券抵扣策略
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
