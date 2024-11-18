package com.douglasmatosdev.service;

public class NewsPlatform implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        // Here we can implement the logic to notify the news platform
        System.out.println("\nNewsPlatform");
        System.out.println("Price updated: " + oldPrice + " -> " + newPrice);
    }
}
