package ar.com.ada.categories.tool;

import ar.com.ada.store.Product;
import ar.com.ada.store.ShoppingCart;

public abstract class Tool extends Product {

    // Atributos
    protected final Double discountRate = 0.5;
    private Double discount = 0.;

//    Constructor

    public Tool(Double listPrice, String productName) {
        super(listPrice, productName);
    }


    //    5% de desc si el pago es con TDC
    @Override
    public Double calculateDiscount() {
        if (ShoppingCart.paymentMethod == 2) {
            this.discount = listPrice * discountRate;
        }
        return discount;
    }
}
