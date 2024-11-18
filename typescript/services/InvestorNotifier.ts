import { BitcoinPriceObserver } from "./BitcoinPriceObserver";

export class InvestorNotifier implements BitcoinPriceObserver {
    update(oldPrice: number, newPrice: number) {
        console.log('\n\nInvestorNotifier');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}