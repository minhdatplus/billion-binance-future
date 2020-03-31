package com.binance.future.sdk.model.enums;

import com.binance.future.sdk.impl.utils.EnumLookup;

/**
 * buy, sell.
 */
public enum TradeDirection {
  BUY("buy"),
  SELL("sell");

  private final String code;

  TradeDirection(String side) {
    this.code = side;
  }

  @Override
  public String toString() {
    return code;
  }

  private static final EnumLookup<TradeDirection> lookup = new EnumLookup<>(TradeDirection.class);

  public static TradeDirection lookup(String name) {
    return lookup.lookup(name);
  }
}
