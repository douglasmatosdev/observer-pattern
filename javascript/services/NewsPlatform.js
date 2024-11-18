const BitcoinPriceObserver = require('./BitcoinPriceObserver');

class NewsPlatform extends BitcoinPriceObserver {
    update(oldPrice, newPrice) {
        console.log('\n\nNewsPlatform');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}

module.exports = NewsPlatform;