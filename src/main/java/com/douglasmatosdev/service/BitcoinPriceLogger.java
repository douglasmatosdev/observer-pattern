package com.douglasmatosdev.service;

public class BitcoinPriceLogger implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        System.out.println("\nBitcoinPriceLogger");
        System.out.println("Old price: " + oldPrice);
        System.out.println("New price: " + newPrice);
    }
}
