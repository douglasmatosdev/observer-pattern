const Bitcoin = require('./criptocurrency/Bitcoin');
const BinanceApi = require('./criptocurrency/BinanceApi');

const BitcoinPriceLogger = require('./services/BitcoinPriceLogger');
const InvestorNotifier = require('./services/InvestorNotifier');
const NewsPlatform = require('./services/NewsPlatform');


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