package com.bruce.coupon.calculation.service;

import com.bruce.coupon.calculation.domain.ShoppingCart;

public interface RuleTemplate {

    // 计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}
