package Models;

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

}
