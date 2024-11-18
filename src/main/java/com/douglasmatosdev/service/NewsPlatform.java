package com.douglasmatosdev.service;

public class NewsPlatform implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        System.out.println("\nNewsPlatform");
        System.out.println("Old price: " + oldPrice);
        System.out.println("New price: " + newPrice);
    }
}
