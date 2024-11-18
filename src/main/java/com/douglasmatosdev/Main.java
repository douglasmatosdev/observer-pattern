package com.douglasmatosdev;

import com.douglasmatosdev.criptocurrency.BinanceApi;
import com.douglasmatosdev.criptocurrency.Bitcoin;
import com.douglasmatosdev.service.BitcoinPriceLogger;
import com.douglasmatosdev.service.InvestorNotifier;
import com.douglasmatosdev.service.NewsPlatform;

public class Main {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();

        BinanceApi binanceApi = new BinanceApi();
        Double newPrice = binanceApi.getLastPrice();

        bitcoin.addObserver(new BitcoinPriceLogger());
        bitcoin.addObserver(new InvestorNotifier());
        bitcoin.addObserver(new NewsPlatform());

        bitcoin.setPrice(newPrice);
    }
}