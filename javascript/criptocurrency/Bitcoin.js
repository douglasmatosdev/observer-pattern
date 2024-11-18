class Bitcoin {
    #price = 0;
    #observers = [];

    constructor() {
        this.#price = 0;
    }

    getPrice() {
        return this.#price;
    }

    setPrice(price) {
        if (this.#price !== price) {
            // Notify the observers
            this.notifyObservers(this.#price, price);
            this.#price = price;
        }
    }

    addObserver(observer) {
        this.#observers.push(observer);
    }

    notifyObservers(oldPrice, newPrice) {
        // Notify the observer calling the update method of all observers
        this.#observers.forEach(observer => observer.update(oldPrice, newPrice));
    }

}


module.exports = Bitcoin;