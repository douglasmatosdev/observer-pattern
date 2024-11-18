package com.douglasmatosdev.criptocurrency;

public class Bitcoin {
    private Double price;

    public Bitcoin() {
    }

    public Bitcoin(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (!this.price.equals(price)) {
            this.price = price;
        }
    }
}
