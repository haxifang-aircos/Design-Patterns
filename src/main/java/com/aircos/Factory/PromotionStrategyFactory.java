package com.aircos.Factory;

import com.aircos.ConcreteStrategy.CashbackStrategy;
import com.aircos.ConcreteStrategy.CouponStrategy;
import com.aircos.ConcreteStrategy.EmptyStrategy;
import com.aircos.ConcreteStrategy.GroupbuyStrategy;
import com.aircos.IStrategy.IPromotionStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFactory {

    private static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<String, IPromotionStrategy>();
    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private PromotionStrategyFactory() {

    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys() {
        return PROMOTIONS.keySet();
    }
}
