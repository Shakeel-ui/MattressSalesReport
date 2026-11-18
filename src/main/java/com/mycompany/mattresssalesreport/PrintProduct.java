package com.mycompany.mattresssalesreport;


public class PrintProduct {

    // Print the total product sales
    public void printTotalSales(int totalSales) {
        System.out.println("TOTAL PRODUCT SALES: " + totalSales);
    }

    // Print the average product sales
    public void printAverageSales(double averageSales) {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",averageSales);
    }

    // Print the most popular product
    public void printMostPopularProduct(String popularProduct) {
        System.out.println("MOST POPULAR PRODUCT: " + popularProduct);
    }
}

