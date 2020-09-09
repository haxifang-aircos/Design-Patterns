package com.aircos.ConcreteStrategy;

import com.aircos.IStrategy.IPromotionStrategy;

/**
 * 拼团优惠策略
 */
public class GroupbuyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
