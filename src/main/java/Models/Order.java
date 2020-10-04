package Models;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class Order {

    private String orderID;
    private ArrayList<Product> orders = new ArrayList<>();

    public Order() {
        byte[] generateRandomId = new byte[6];
        new Random().nextBytes(generateRandomId);
        String randomID = new String(generateRandomId, Charset.forName("UTF-8"));
        this.orderID = randomID;
    }

    public ArrayList<Product> getOrder(){
        return orders;
    }

    public String getOrderID(){
        return orderID;
    }

    public void addProductsToOrder(Product product){
        this.orders.add(product);
    }

    public String listOfOrdersByCustomer(){
        String result = "";
        for (int i = 0; i < orders.size(); i++) {
            result += "Produkt: " + orders.get(i).getProductName()
                    + "; Preis: " + orders.get(i).getProductPrice() + "\n";
        }
        return result;
    }

}
