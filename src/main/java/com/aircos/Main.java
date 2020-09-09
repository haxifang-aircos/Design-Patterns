package com.aircos;

import com.aircos.Context.PayStrategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1", "2020031401000323", 324.5);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
