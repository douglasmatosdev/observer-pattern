const BitcoinPriceObserver = require('./BitcoinPriceObserver');

class InvestorNotifier extends BitcoinPriceObserver {
    update(oldPrice, newPrice) {
        console.log('\n\nInvestorNotifier');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}

module.exports = InvestorNotifier;