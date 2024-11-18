package com.douglasmatosdev.service;

public class InvestorNotifier implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        System.out.println("\nInvestorNotifier");
        System.out.println("Old price: " + oldPrice);
        System.out.println("New price: " + newPrice);
    }
}
