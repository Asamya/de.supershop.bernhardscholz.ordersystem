package Controllers;


import Models.Order;

import java.util.HashMap;

public class OrderDB {

    private HashMap<String, Order> orders = new HashMap<>();

    public HashMap<String, Order> getHashMap(){
        return orders;
    }

    public void addOrderOfCustomer(Order order) {
        orders.put(order.getOrderID(), order);
    }

    public Order getOrderOfCustomerById(String id) {
        return orders.get(id);
    }

    public String listOfAllOrders(){
        String result = "Orders in DB: \n";
        for (Order order : orders.values()) {
            result += "Order-ID: " + order.getOrderID() + "\n" +
                        "Products ordered: " + order.listOfOrdersByCustomer() + "\n\n";
        }
        return result;
    }
}
