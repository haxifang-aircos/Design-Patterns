package com.aircos.ConcreteStrategy;

import com.aircos.IStrategy.IPromotionStrategy;

/**
 * 无优惠策略
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
