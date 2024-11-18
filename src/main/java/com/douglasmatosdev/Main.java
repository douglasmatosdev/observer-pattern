package com.douglasmatosdev;

import com.douglasmatosdev.criptocurrency.BinanceApi;
import com.douglasmatosdev.criptocurrency.Bitcoin;

public class Main {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();

        BinanceApi binanceApi = new BinanceApi();

        Double newPrice = binanceApi.getLastPrice();

        bitcoin.setPrice(newPrice);
    }
}