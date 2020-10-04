package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testToString() {
        //Given
        Product product = new Product(1234, "Superman-Shirt",2500);
        String actual = "\n" +
                            "productID: 1234\n" +
                            "productName: Superman-Shirt\n" +
                            "productPrice: 2500\n";

        //When
        String result = product.toString();

        //Then
        assertEquals(actual, result);
    }
}