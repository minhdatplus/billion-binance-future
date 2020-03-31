package com.binance.future.sdk.impl.utils;

@FunctionalInterface
public interface Handler<T> {

  void handle(T t);
}
