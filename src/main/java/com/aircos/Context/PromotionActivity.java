package com.aircos.Context;

import com.aircos.IStrategy.IPromotionStrategy;

/**
 * 促销活动方案
 *
 * note: 上下文环境
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doPromotion();
    }
}
