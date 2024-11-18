package com.douglasmatosdev.service;

public interface BitcoinPriceObserver {
    public void update(Double oldPrice, Double newPrice);
}
