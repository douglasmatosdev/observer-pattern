const BitcoinPriceObserver = require('./BitcoinPriceObserver');

class BitcoinPriceLogger extends BitcoinPriceObserver {
    update(oldPrice, newPrice) {
        console.log('\n\nBitcoinPriceLogger');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}

module.exports = BitcoinPriceLogger;