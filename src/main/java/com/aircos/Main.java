package com.aircos;

import com.aircos.Factory.PromotionStrategyFactory;
import com.aircos.IStrategy.IPromotionStrategy;

public class Main {
    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionKeys();

        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
