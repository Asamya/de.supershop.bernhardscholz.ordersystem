package Controllers;

import Models.Product;

import java.util.*;

public class ProductDB {

    private HashMap<Integer, Product> products = new HashMap<>();

    private Product superman =  new Product(1,"Superman",2499);
    private Product superwoman = new Product(2,"Superwoman",2999);
    private Product spiderman = new Product(3, "Spiderman", 2599);
    private Product hulk = new Product(4, "Hulk", 3000);
    private Product sheHulk = new Product(5, "She-Hulk", 2599);

    public ProductDB() {
        products.put(superman.getProductID(),superman);
        products.put(superwoman.getProductID(),superwoman);
        products.put(spiderman.getProductID(),spiderman);
        products.put(hulk.getProductID(),hulk);
        products.put(sheHulk.getProductID(),sheHulk);
    }

    public Product getProductById(int id) {
        return products.get(id);
    }

    public void addProductToList(Product product) {
        products.put(product.getProductID(), product);
    }


    public String listProduct () {
        return products.values().toString();
    }


    @Override
    public String toString() {
        String result = "Products\n";
        for (Product product : products.values()) {
            result += "Superhero: " + product.getProductName() + "\n"
                + "Price: " + product.getProductPrice() + "\n";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDB productDB = (ProductDB) o;
        return Objects.equals(products, productDB.products) &&
                Objects.equals(superman, productDB.superman) &&
                Objects.equals(superwoman, productDB.superwoman) &&
                Objects.equals(spiderman, productDB.spiderman) &&
                Objects.equals(hulk, productDB.hulk) &&
                Objects.equals(sheHulk, productDB.sheHulk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, superman, superwoman, spiderman, hulk, sheHulk);
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

