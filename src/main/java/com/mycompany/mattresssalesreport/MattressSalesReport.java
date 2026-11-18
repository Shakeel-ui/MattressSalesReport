package com.mycompany.mattresssalesreport;

import java.util.Scanner;

public class MattressSalesReport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Store the names of the mattress products
        String[] products = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};

        // Store sales for three products over three months
        int[][] sales = new int[3][3];

        // Allows the user to enter the monthly sales of the matresses
        for (int i = 0; i < products.length; i++) {
 
            for (int j = 0; j < sales[i].length; j++) {
            
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
                
        }
            System.out.println();
    }

        // Create objects
        Product product = new Product(products, sales);
        PrintProduct printProduct = new PrintProduct();

        // Calculate sales results
        int totalSales = product.GetTotalProductsSold();
        double averageSales = product.GetAverageProductSold();
        String popularProduct = product.GetMostPopularProduct();

        // Display the product sales report
        System.out.println("");
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("");
        System.out.println("****************************************");

        printProduct.printTotalSales(totalSales);
        printProduct.printAverageSales(averageSales);
        printProduct.printMostPopularProduct(popularProduct);

        scanner.close();
    }
}


