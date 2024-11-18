package com.douglasmatosdev;

import com.douglasmatosdev.criptocurrency.BinanceApi;
import com.douglasmatosdev.criptocurrency.Bitcoin;
import com.douglasmatosdev.service.BitcoinPriceLogger;
import com.douglasmatosdev.service.InvestorNotifier;
import com.douglasmatosdev.service.NewsPlatform;

public class Main {
    public static void main(String[] args) {

        // Class Observable
        Bitcoin bitcoin = new Bitcoin();

        // Class BinanceApi
        BinanceApi binanceApi = new BinanceApi();
        // Simulating the new price of Bitcoin fetched from Binance API
        Double newPrice = binanceApi.getLastPrice();

        // Adding the observers to the Bitcoin Observable
        bitcoin.addObserver(new BitcoinPriceLogger());
        bitcoin.addObserver(new InvestorNotifier());
        bitcoin.addObserver(new NewsPlatform());

        // Setting the new price of Bitcoin
        bitcoin.setPrice(newPrice);
    }
}