package com.EcommerceSearchFunction;

import java.util.*;

public class BinarySearch {
	public static Product searchByProdId(List<Product> sortedProducts, int prodId) {
		int n = sortedProducts.size();
		int low = 0, high = n - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			Product currProd = sortedProducts.get(mid);
			if(currProd.productId == prodId) 
				return currProd;
			else if(currProd.productId < prodId) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return null;
	}
	public static Product searchByProdName(List<Product> sortedProducts, String prodName) {
		int n = sortedProducts.size();
		int low = 0, high = n - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			Product currProd = sortedProducts.get(mid);
			if(currProd.productName.compareToIgnoreCase(prodName) == 0) 
				return currProd;
			else if(currProd.productName.compareToIgnoreCase(prodName) < 0) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return null;
    }
	public static List<Product> searchByProdCate(List<Product> sortedProducts, String ProdCate) {
		int n = sortedProducts.size();
		List<Product> result = new ArrayList<Product>();
		for(int i = 0; i < n; i++) {
			Product currProd = sortedProducts.get(i);
			if(currProd.category.equalsIgnoreCase(ProdCate)) 
					result.add(currProd);
		}
		return result; 		    	
    }	
}
