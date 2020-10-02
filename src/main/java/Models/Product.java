package Models;

import java.util.Objects;

public class Product {

    private int productID;
    private String productName;
    private int productPrice;


    // Constructor
    public Product(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = price;
    }


    // Getter and setter
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID &&
                productPrice == product.productPrice &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, productPrice);
    }

    @Override
    public String toString() {
        return "Product: \n" +
                "productID= " + productID + "\n" +
                "productName= " + productName + "\n" +
                "productPrice= " + productPrice + "\n";
    }
}
