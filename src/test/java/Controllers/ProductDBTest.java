package Controllers;

import Models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    @Test
    @DisplayName("Optional returns null")
    void testOptionalFindByIdEqualsNull() {
        //Given
        ProductDB studentDB = new ProductDB(
                List.of(
                        new Product(1,"Superman",1850),
                        new Product(2,"Superwoman",1230)
                ));

        //When
        Optional<Product> actual = studentDB.getProduct(3);

        //Then
        assertFalse(actual.isPresent());
    }

    @Test
    @DisplayName("Optional returns value")
    void testOptionalFindByIdHasValue() {
        //Given
        ProductDB studentDB = new ProductDB(
                List.of(
                        new Product(1,"Superman",1850),
                        new Product(2,"Superwoman",1230)
                ));

        //When
        Optional<Product> actual = studentDB.getProduct(2);

        //Then
        assertTrue(actual.isPresent());
        assertEquals(new Product(2,"Superwoman",1230), actual.get());
    }

}