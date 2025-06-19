package com.EcommerceSearchFunction;

public class Product { //store the product data.
	public int productId;
	public String productName;
	public String category;
	Product(int productId, String prouctName, String category) {
		this.productId = productId;
		this.productName = prouctName;
		this.category = category;
	}
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return category;
    }
}
