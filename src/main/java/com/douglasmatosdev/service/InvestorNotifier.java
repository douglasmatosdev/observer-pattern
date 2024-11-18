package com.douglasmatosdev.service;

public class InvestorNotifier implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        if (newPrice > oldPrice) {
            System.out.println("Price increased! Notify investors!");
        } else {
            System.out.println("Price decreased! Notify investors!");
        }
    }
}
