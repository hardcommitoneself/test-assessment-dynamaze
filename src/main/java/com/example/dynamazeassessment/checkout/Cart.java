package com.example.dynamazeassessment.checkout;

public class Cart {
    private CartItem[] items;

    public Cart(CartItem[] items) {
        this.items = items;
    }

    // getter
    public CartItem[] getItems() {
        return this.items;
    }

    public int findIndexByItem(String item) {
        int index = -1;

        for(int i = 0; i < this.items.length; i++) {
            if(this.items[i].getItemName().equals(item)) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void increaseItemAmount(int index) {
        this.items[index].increaseAmount();
    }

    public long getTotal() {
        long total = 0;
        for(CartItem item: this.items) {
            total += item.getTotal();
        }
        return total;
    }
}
