package com.example.dynamazeassessment.checkout;

public class Checkout {
    private Cart cart;
    private long total = 0;

    public Checkout(Rule[] rules) {
        CartItem[] items = new CartItem[rules.length];
        for(int i = 0; i < rules.length; i++) {
            items[i] = new CartItem(rules[i].getItemName(), 0, rules[i]);
        }
        this.cart = new Cart(items);
    }

    // getter
    public Cart getCart() {
        return this.cart;
    }

    public long getTotal() {
        return this.total;
    }

    // scan item
    public void scan(String item) {
        this.cart.increaseItemAmount(this.cart.findIndexByItem(item));
        this.total = cart.getTotal();
    }
}