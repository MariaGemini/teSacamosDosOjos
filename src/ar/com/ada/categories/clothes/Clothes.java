package ar.com.ada.categories.clothes;

import ar.com.ada.store.Product;

public abstract class Clothes extends Product {
    protected Integer deparment;
    protected final Double discountRate = 0.15;
    protected Double discount = 0.;

    public Clothes(Double listPrice, String productName, Integer deparment) {
        super(listPrice, productName);
        this.deparment = deparment;
    }

    @Override
    public Double calculateDiscount() {
        if (deparment == 1 || deparment == 2) {
            this.discount = listPrice * discountRate;
        }
        return discount;
    }
}
