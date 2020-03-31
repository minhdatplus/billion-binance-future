package com.binance.future.sdk.impl;


import com.binance.future.sdk.impl.utils.JsonWrapper;

@FunctionalInterface
public interface RestApiJsonParser<T> {

  T parseJson(JsonWrapper json);
}
