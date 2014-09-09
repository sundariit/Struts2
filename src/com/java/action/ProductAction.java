package com.java.action;

import java.util.ArrayList;
import java.util.List;
import com.java.dao.Product;
import com.java.dao.ProductDAO;


public class ProductAction {
	
		Product product  = new Product();
	    List<Product> productList = new ArrayList<Product>();
		ProductDAO dao = new ProductDAO();
		
		 public Product getProduct() {
				return product;
			}


			public void setProduct(Product product) {
				this.product = product;
			}


			public List<Product> getProductList() {
				return productList;
			}


			public void setProductList(List<Product> productList) {
				this.productList = productList;
			}
	    
	   
	   public String listProducts()
	   {
	      productList = dao.getProducts();
	      return "success";
	   }

}
