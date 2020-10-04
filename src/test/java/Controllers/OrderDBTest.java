package Controllers;


import Models.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class OrderDBTest {

    @Test
    @DisplayName("Does the order list add a order")
    public void testAddOrderOfCustomer(){
        ProductDB newProducts = new ProductDB();
        OrderDB newOrders = new OrderDB();
        Order test1 = new Order();
        Order test2 = new Order();
        Order test3 = new Order();

        test1.addProductsToOrder(newProducts.getProductById(2));
        test2.addProductsToOrder(newProducts.getProductById(4));
        test3.addProductsToOrder(newProducts.getProductById(5));

        newOrders.addOrderOfCustomer(test1);
        newOrders.addOrderOfCustomer(test2);
        newOrders.addOrderOfCustomer(test3);

        assertThat(newOrders.getHashMap().size(),equalTo(3));
    }



}