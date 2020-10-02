import Controllers.ProductDB;
import Models.Product;

import java.util.List;

public class ShopOwnerApp {

    public static void main(String[] args) {

        ProductDB products = new ProductDB(List.of(
                new Product(1,"Superman",1850),
                new Product(2,"Superwoman",1230)
        ));

        System.out.println(products.listProduct());


    }

}
