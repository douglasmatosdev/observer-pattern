import { BitcoinPriceObserver } from "./BitcoinPriceObserver";

export class NewsPlatform implements BitcoinPriceObserver {
    update(oldPrice: number, newPrice: number) {
        console.log('\n\nNewsPlatform');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}