package com.douglasmatosdev.service;

public class InvestorNotifier implements BitcoinPriceObserver {

    @Override
    public void update(Double oldPrice, Double newPrice) {
        // Here we can implement the logic to notify the investors
        System.out.println("\nInvestorNotifier");
        System.out.println("Old price: " + oldPrice);
        System.out.println("New price: " + newPrice);
    }
}
