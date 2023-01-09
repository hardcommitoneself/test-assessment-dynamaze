package com.example.dynamazeassessment.checkout;

public class CartItem {
    private String itemName;
    private long amount;
    private Rule rule;
    private long total;

    public CartItem(String itemName, long amount, Rule rule) {
        this.itemName = itemName;
        this.amount = amount;
        this.rule = rule;
        this.total = 0;
    }

    // getter
    public String getItemName() {
        return this.itemName;
    }

    public long getAmount() {
        return this.amount;
    }

    public Rule getRule() {
        return this.rule;
    }

    public long getTotal() {
        return this.total;
    }

    // calc total price of this item
    private void calc() {
        if(rule.getSpecialPrice() == null) {
            this.total = amount * rule.getUnitPrice();
        } else {
            if(this.amount >= rule.getSpecialPrice().getAmount()) {
                this.total = (this.amount / rule.getSpecialPrice().getAmount()) * rule.getSpecialPrice().getPrice();
                this.total += (this.amount % rule.getSpecialPrice().getAmount()) * rule.getSpecialPrice().getPrice();
            } else {
                this.total = amount * rule.getUnitPrice();
            }
        }
    }

    public void increaseAmount() {
        this.amount++;

        // whenever the amount is changed, the total price might be calculated
        this.calc();
    }
}
