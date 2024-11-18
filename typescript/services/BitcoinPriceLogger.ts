import { BitcoinPriceObserver } from "../services/BitcoinPriceObserver";

export class BitcoinPriceLogger implements BitcoinPriceObserver {
    update(oldPrice: number, newPrice: number): void {
        console.log('\n\nBitcoinPriceLogger');
        console.log(`Price updated: ${oldPrice} -> ${newPrice}`);
    }
}