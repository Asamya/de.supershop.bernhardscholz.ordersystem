package Controllers;

import Models.Product;

import java.util.*;

public class ProductDB {

    private HashMap<Integer, Product> products;

    public ProductDB(List<Product> products) {
        this.products = new HashMap<>();
        for (Product product : products) {
            addProduct(product);
        }

    }

    public Optional<Product> getProduct(int id) {
        Product returnProduct = products.get(id);
        return (returnProduct == null) ? Optional.empty() : Optional.of(returnProduct);
    }

    public void addProduct (Product product) {
        products.put(product.getProductID(), product);
    }


    public String listProduct () {
        return products.values().toString();
    }


    @Override
    public String toString() {
        return "ProductDB\n" +
                "Products:\n" + products;
    }
}





    /*public List<Product> listProductDB() {
        return new ArrayList<>(products.values());
    }


     */



    //To much effort not the function needed
    /*public void addProduct (Product product) {
        products.put(product.getProductID(), product);
    }

    public Map<Integer, Product> getProductHashMap() {
        return products;
    }

    public List<Product> listProduct () {
        return new ArrayList<>(products.values());
    }

    @Override
    public String toString() {
        String result = "";
        for (Product product : listProduct()) {
            result += product.toString();
        }
        return result;
    }

     */

