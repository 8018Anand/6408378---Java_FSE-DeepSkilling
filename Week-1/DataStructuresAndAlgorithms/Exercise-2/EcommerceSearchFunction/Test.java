package com.EcommerceSearchFunction;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int numOfProducts = sc.nextInt();

        System.out.println("Enter details of each product: 'product_id product_name product_category':");

        for (int i = 0; i < numOfProducts; i++) {
            int product_id = sc.nextInt();
            String product_name = sc.next();
            String product_category = sc.next();
            Product p = new Product(product_id, product_name, product_category);
            products.add(p);
        }

        // Linear Search Demonstration
        System.out.println("\n-----------------Linear Searching-----------------");

        System.out.print("Enter Product ID to search (Linear): ");
        int idToSearch = sc.nextInt();
        Product foundById = LinearSearch.searchByProdId(products, idToSearch);
        if(foundById == null) {
        	System.out.println("Product not found.");
        } else {
        	System.out.println("Product ID: "+ foundById.productId);
        	System.out.println("Product Name: "+ foundById.productName);
        	System.out.println("Product category: "+ foundById.category);
        }
        
        System.out.print("Enter Product Name to search (Linear): ");
        String nameToSearch = sc.next();
        Product foundByName = LinearSearch.searchByProdName(products, nameToSearch);
        if(foundById == null) {
        	System.out.println("Product not found.");
        } else {
        	System.out.println("Product ID: "+ foundByName.productId);
        	System.out.println("Product Name: "+ foundByName.productName);
        	System.out.println("Product category: "+ foundByName.category);
        }


        System.out.print("Enter Product Category to search (Linear): ");
        String categoryToSearch = sc.next();
        List<Product> foundByCategory = LinearSearch.searchByProdCate(products, categoryToSearch);
        for(int i = 0; i < foundByCategory.size(); i++) {
        	Product current= foundByCategory.get(i);
        	System.out.println("Product ID: "+ current.productId);
        	System.out.println("Product Name: "+ current.productName);
        	System.out.println("Product category: "+ current.category);
        	System.out.println("--------------");
        }
        if(foundByCategory.size() == 0) {
        	System.out.println("No products found with this category");
        }

        // Binary Search Demonstration
        System.out.println("\n-----------------Binary Searching-----------------");

        // Create sorted references
        List<Product> sortedById = ProductSorter.sortById(products);
        List<Product> sortedByName = ProductSorter.sortByName(products);
        List<Product> sortedByCategory = ProductSorter.sortByCategory(products);

        System.out.print("Enter Product ID to search (Binary): ");
        int idToSearchBinary = sc.nextInt();
        Product binById = BinarySearch.searchByProdId(sortedById, idToSearchBinary);
        if(binById == null) {
        	System.out.println("Product not found.");
        } else {
        	System.out.println("Product ID: "+ binById.productId);
        	System.out.println("Product Name: "+ binById.productName);
        	System.out.println("Product category: "+ binById.category);
        }


        System.out.print("Enter Product Name to search (Binary): ");
        String nameToSearchBinary = sc.next();
        Product binByName = BinarySearch.searchByProdName(sortedByName, nameToSearchBinary);
        if(binByName == null) {
        	System.out.println("Product not found.");
        } else {
        	System.out.println("Product ID: "+ binByName.productId);
        	System.out.println("Product Name: "+ binByName.productName);
        	System.out.println("Product category: "+ binByName.category);
        }


        System.out.print("Enter Product Category to search (Binary): ");
        String categoryToSearchBinary = sc.next();
        List<Product> binByCategory = BinarySearch.searchByProdCate(sortedByCategory, categoryToSearchBinary);
        for(int i = 0; i < binByCategory.size(); i++) {
        	Product current= binByCategory.get(i);
        	System.out.println("Product ID: "+ current.productId);
        	System.out.println("Product Name: "+ current.productName);
        	System.out.println("Product category: "+ current.category);
        	System.out.println("--------------");
        }
        if(binByCategory.size() == 0) {
        	System.out.println("No products found with this category");
        }

        sc.close();
    }
}