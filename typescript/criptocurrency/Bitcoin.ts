import { BitcoinPriceObserver } from "../services/BitcoinPriceObserver";

export class Bitcoin {
    #price: number = 0;
    #observers: BitcoinPriceObserver[] = [];

    constructor() {
        this.#price = 0;
    }

    getPrice(): number {
        return this.#price;
    }

    setPrice(price: number): void {
        if (this.#price !== price) {
            // Notify the observers
            this.notifyObservers(this.#price, price);
            this.#price = price;
        }
    }

    addObserver(observer: BitcoinPriceObserver): void {
        this.#observers.push(observer);
    }

    notifyObservers(oldPrice: number, newPrice: number): void {
        // Notify the observer calling the update method of all observers
        this.#observers.forEach(observer => observer.update(oldPrice, newPrice));
    }

}