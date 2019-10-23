package ar.com.ada.categories.grocery;

import ar.com.ada.store.Product;
import ar.com.ada.store.ShoppingCart;

import java.time.DayOfWeek;

public abstract class Grocery extends Product {
//    Atributos

    protected final Double discountRate = 0.10;
    protected Double discount = 0.;

//    Constructor

    public Grocery(Double listPrice, String productName) {
        super(listPrice, productName);
    }

//    Método que calcula el descuento, si corresponde al día. - OK!!
    @Override
    public Double calculateDiscount(){
        if(ShoppingCart.day.equals(DayOfWeek.WEDNESDAY)|| ShoppingCart.day.equals(DayOfWeek.THURSDAY)){
            this.discount = listPrice * discountRate;
        }
        return discount;
    }



}
