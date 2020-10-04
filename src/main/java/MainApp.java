import Controllers.ProductDB;
import Models.Order;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner startNewOrder = new Scanner(System.in);

        while (true) {
            System.out.println("Hallo lieber Kunde, liebe Kundin wie heißt du: ");
            String customerName = startNewOrder.next();
            ;
            System.out.println(customerName + " welches Produkt möchtest du bestellen? : ");
            ProductDB products = new ProductDB();
            Order order = new Order();
            System.out.println(products.toString());
            int productId = startNewOrder.nextInt();
            order.addProductsToOrder(products.getProductById(productId));
            System.out.println("Der Artikel liegt jetzt in deinem Warenkorb.\n Diese Artikel befinden sich bereits in deinem Warenkorb: ");
            System.out.println(order.listOfOrdersByCustomer());
            System.out.println("Vielen Dank für deine Bestellung. Zum Verlassen drücke \"q\"");
            String end = startNewOrder.next();
            if (end.equals("q")) break;
            System.out.println(end);
        }
        System.out.println("Bis bald.");
        startNewOrder.close();
    }
}
