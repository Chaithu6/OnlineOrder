package com.onlineorder.service;

import java.util.List;

import com.onlineorder.entities.Product;
import com.onlineorder.exceptions.ProductNotFoundException;



public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(Integer productId) throws ProductNotFoundException;
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProductById(Integer productId);
}
