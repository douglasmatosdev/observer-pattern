package com.douglasmatosdev.criptocurrency;

import com.douglasmatosdev.service.BitcoinPriceObserver;

import java.util.ArrayList;
import java.util.List;

public class Bitcoin {
    private Double price = 0.0;
    private List<BitcoinPriceObserver> observers = new ArrayList<>();

    public Bitcoin() {
    }

    public Bitcoin(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (!this.price.equals(price)) {
            this.price = price;
            // Notify the observers
            notifyObservers(this.price, price);
        }
    }

    public void addObserver(BitcoinPriceObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Double oldPrice, Double newPrice) {
        for (BitcoinPriceObserver observer : observers) {
            // Notify the observer calling the update method of all observers
            observer.update(oldPrice, newPrice);
        }
    }
}
