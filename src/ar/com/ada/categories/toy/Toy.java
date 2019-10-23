package ar.com.ada.categories.toy;

import ar.com.ada.store.Product;

public abstract class Toy extends Product {

//    Atributos

    protected final Double discountRate = 0.25;
    public static Integer quantity = 0;
    protected Double discount = 0.;


// Constructor, aumenta el contador en 1 cada vez que se crea un objeto Toy
    public Toy(Double listPrice, String productName) {
        super(listPrice, productName);
        quantity++;
    }

//    Método que calcula el descuento si el precio de lista es mayor a $3000 o la cantidad mayor a 3 - ok!!

    @Override
    public Double calculateDiscount() {
        if(listPrice > 3000 || Toy.quantity > 3 )
            this.discount = listPrice * discountRate;
        return discount;
    }
}
