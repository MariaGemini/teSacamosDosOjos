package ar.com.ada.store;

public abstract class Product {
    protected Double listPrice;
    protected String productName;


    public Product(Double listPrice, String productName) {
        this.listPrice = listPrice;
        this.productName = productName;
    }


    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract Double calculateDiscount();
}
