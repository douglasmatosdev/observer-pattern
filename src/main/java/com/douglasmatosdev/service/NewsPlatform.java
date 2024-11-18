package com.douglasmatosdev.service;

public class NewsPlatform implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        if (newPrice > oldPrice) {
            System.out.println("Price increased! Notify news platform!");
        } else {
            System.out.println("Price decreased! Notify news platform!");
        }
    }
}
