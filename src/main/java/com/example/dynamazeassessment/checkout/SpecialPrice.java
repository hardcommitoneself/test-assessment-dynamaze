package com.example.dynamazeassessment.checkout;

public class SpecialPrice {
    private long amount;
    private long price;

    public SpecialPrice(long amount, long price) {
        this.amount = amount;
        this.price = price;
    }

    // getter
    public long getAmount() {
        return this.amount;
    }

    public long getPrice() {
        return this.price;
    }
}
