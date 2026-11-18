package com.mycompany.mattresssalesreport;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        // Product names
        String[] products = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"
        };

        // Monthly sales for each mattress
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        // Create Product object
        Product product = new Product(products, sales);

        // Verify total product sales
        int expected = 153;
        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        // Product names
        String[] products = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};

        // Monthly sales for each mattress
        int[][] sales = {{25, 18, 20},{15, 10, 12},{18, 15, 20}};

        // Create Product object
        Product product = new Product(products, sales);

        // Verify average product sales
        double expected = 17.0;
        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.001);
    }
}

