package Services;

import Controllers.OrderDB;
import Models.Order;
import Models.Product;

import java.util.ArrayList;

public class Service {

    public void addNewOrderToOrderDb(ArrayList<Product> orders, OrderDB order) {
        Order newOrder = new Order();
        for (Product product : orders){
            newOrder.addProductsToOrder(product);
        }
        order.addOrderOfCustomer(newOrder);
    }

    public String listOfOrders(OrderDB order) {
        return order.listOfAllOrders();
    }
}
