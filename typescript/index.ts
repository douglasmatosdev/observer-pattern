import { Bitcoin } from "./criptocurrency/Bitcoin";
import { BinanceApi } from "./criptocurrency/BinanceApi";

import { BitcoinPriceLogger } from "./services/BitcoinPriceLogger";
import { InvestorNotifier } from "./services/InvestorNotifier";
import { NewsPlatform } from "./services/NewsPlatform";

class Main {
    constructor() {
        this.init();
    }

    init() {
        // Class Observable
        const bitcoin = new Bitcoin();

        // Class BinanceApi
        const binanceApi = new BinanceApi();
        // Simulating the new price of Bitcoin fetched from Binance API
        const newPrice = binanceApi.getLastPrice();

        // Adding the observers to the Bitcoin Observable
        bitcoin.addObserver(new BitcoinPriceLogger());
        bitcoin.addObserver(new InvestorNotifier());
        bitcoin.addObserver(new NewsPlatform());

        // Setting the new price of Bitcoin
        bitcoin.setPrice(newPrice);
    }
}

new Main();