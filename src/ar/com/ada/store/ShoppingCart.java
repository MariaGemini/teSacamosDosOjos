package ar.com.ada.store;

import ar.com.ada.store.Product;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


public class ShoppingCart {

    public static Integer paymentMethod;
    private Double totalDiscount = 0.;
    private Double paymentWithoutDiscount = 0.;
    private Double paymentWithDiscount = 0.;
    public static LocalDate date = LocalDate.now();
    public static DayOfWeek day = date.getDayOfWeek();


    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public Double getPaymentWithoutDiscount() {
        return paymentWithoutDiscount;
    }

    public Double getPaymentWithDiscount() {
        return paymentWithDiscount;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ArrayList<Product> productlist = new ArrayList<>();


//    metodo para agregar un articulo al array - OK!!

    public void addToProductList(Product producto) {
        productlist.add(producto);
    }


//    metodo que calcula el precio total sin descuento - OK!!

    public Double calculateTotalWithoutdisc() {
        for (int i = 0; i < productlist.size(); i++) {
            this.paymentWithoutDiscount += productlist.get(i).getListPrice();
        }
        return this.paymentWithoutDiscount;
    }


//    metodo que calcula el descuento de toda la compra - OK!!

    public void calculateTotalDisc() {
        for (int i = 0; i < productlist.size(); i++) {
            this.totalDiscount = totalDiscount + productlist.get(i).calculateDiscount();
        }
    }


//    metodo que calcule el total a pagar - OK!!

    public void calculateTotalWithDisc(){
        this.paymentWithDiscount = this.paymentWithoutDiscount - this.totalDiscount;
    }

}