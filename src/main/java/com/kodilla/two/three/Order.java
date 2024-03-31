package com.kodilla.two.three;


import java.io.Serializable;

public class Order implements Serializable {

    private final String productName;
    private final int amount;
    private final double price;

    public Order(String productName, int amount, double price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
