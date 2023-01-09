package com.example.dynamazeassessment.checkout;

public class Rule {
    private String itemName;
    private long unitPrice;
    private SpecialPrice specialPrice = null;

    public Rule(String itemName, long unitPrice, SpecialPrice specialPrice) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.specialPrice = specialPrice;
    }

    // getter
    public String getItemName() {
        return this.itemName;
    }

    public long getUnitPrice() {
        return this.unitPrice;
    }

    public SpecialPrice getSpecialPrice() {
        return this.specialPrice;
    }
}
