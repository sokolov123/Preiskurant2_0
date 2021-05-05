import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void getProdName() {
        Product product = new Product("морковка", "2", 50, 0);
        assertEquals("морковка", product.prodName);
    }

    @Test
    void setProdName() {
        Product product = new Product("морковка", "2", 50, 0);
        Product product1 = new Product("лук", "2", 50, 0);
        product.prodName = "лук";
        assertEquals(product1, product);
    }

    @Test
    void getProdKey() {
        Product product = new Product("морковка", "2", 50, 0);
        assertEquals("2", product.prodKey);
    }

    @Test
    void setProdKey() {
        Product product = new Product("лук", "2", 50, 0);
        Product product1 = new Product("лук", "3", 50, 0);
        product.prodKey = "3";
        assertEquals(product1, product);
    }

    @Test
    void getRubCost() {
        Product product = new Product("морковка", "2", 50, 36);
        assertEquals(50, product.rubCost);
    }

    @Test
    void setRubCost() {
        Product product = new Product("лук", "5", 75, 0);
        Product product1 = new Product("лук", "5", 50, 0);
        product.rubCost = 50;
        assertEquals(product1, product);
    }

    @Test
    void getKopecksCost() {
        Product product = new Product("морковка", "2", 50, 36);
        assertEquals(36, product.kopecksCost);
    }

    @Test
    void setKopecksCost() {
        Product product = new Product("лук", "5", 50, 47);
        Product product1 = new Product("лук", "5", 50, 30);
        product.rubCost = 30;
        assertEquals(product1, product);
    }
}