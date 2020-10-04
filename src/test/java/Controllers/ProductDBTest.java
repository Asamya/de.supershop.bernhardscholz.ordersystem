package Controllers;

import Models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


class ProductDBTest {

    @Test
    @DisplayName("Does the searched id come up")
    public void testProductById(){
        ProductDB newProducts = new ProductDB();

        Product expected = new Product(3, "Spiderman", 2599);

        assertThat(expected.getProductID(), equalTo(newProducts.getProductById(3).getProductID()));
    }

    @Test
    @DisplayName("Does the String look as expected")
    public void testToSrtring(){
        ProductDB newProducts = new ProductDB();

        String expected = "Products\n"+
                            "Superhero: Superman\nPrice: 2499\n"+
                            "Superhero: Superwoman\nPrice: 2999\n"+
                            "Superhero: Spiderman\nPrice: 2599\n"+
                            "Superhero: Hulk\nPrice: 3000\n"+
                            "Superhero: She-Hulk\nPrice: 2599\n";

        assertThat(newProducts.toString(), equalTo(expected));
    }


}