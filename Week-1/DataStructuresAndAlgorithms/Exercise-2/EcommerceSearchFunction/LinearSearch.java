package com.EcommerceSearchFunction;
import java.util.*;

public class LinearSearch{
	public static Product searchByProdId(List<Product> products, int prodId) {
		int n = products.size();
		Product result = null;
		for(int i = 0; i < n; i++) {
			Product currProd = products.get(i);
			if(currProd.productId == prodId) 
					result = currProd;
		}
		return result;
	}
	public static Product searchByProdName(List<Product> products, String prodName) {
		int n = products.size();
		Product result = null;
		for(int i = 0; i < n; i++) {
			Product currProd = products.get(i);
			if(currProd.productName.equalsIgnoreCase(prodName)) 
					result = currProd;
		}
		return result;    	
    }
	public static List<Product> searchByProdCate(List<Product> products, String ProdCate) {
		int n = products.size();
		List<Product> result = new ArrayList<Product>();
		for(int i = 0; i < n; i++) {
			Product currProd = products.get(i);
			if(currProd.category.equalsIgnoreCase(ProdCate)) 
					result.add(currProd);
		}
		return result; 		    	
    }
}
