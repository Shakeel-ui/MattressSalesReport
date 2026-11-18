package com.mycompany.mattresssalesreport;

public class Product implements IProduct {

    private String[] productNames;
    private int[][] productSales;

    // Constructor
    public Product(String[] productNames, int[][] productSales) {
        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Calculates the total number of products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }

        return total;
    }

    // Calculates the average sales of all matreses
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            count += productSales[i].length;
        }

        return (double) total / count;
    }

    // Finds the most popular products based on total sales
    @Override
    public String GetMostPopularProduct() {

        int highestTotal = -1;
        int highestMonthlySale = 0;
        String popularProduct = "";

        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;
            int monthlyMax = 0;

            for (int j = 0; j < productSales[i].length; j++) {

                productTotal += productSales[i][j];

                // Find the highest monthly sale
                if (productSales[i][j] > monthlyMax) {
                    monthlyMax = productSales[i][j];
                }
            }

            // Compare the total sales of each product
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                highestMonthlySale = monthlyMax;
                popularProduct = productNames[i];
            }
        }

        return popularProduct + "(" + highestMonthlySale + ")";
    }
}
