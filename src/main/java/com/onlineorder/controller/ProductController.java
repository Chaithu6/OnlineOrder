package com.onlineorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineorder.entities.Product;
import com.onlineorder.exceptions.ProductNotFoundException;
import com.onlineorder.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	@GetMapping("/product/{productId}")
	public ResponseEntity getProductById(@PathVariable Integer productId) throws ProductNotFoundException {
		return new ResponseEntity (productService.getProductById(productId), HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		
			return this.productService.addProduct(product);
	}
	
	@PutMapping("/product") 
	public Product updateProduct(@RequestBody Product product) {
		return this.productService.updateProduct(product);
	
	}
@DeleteMapping("/product/{productId}")
public void deleteProductById(@PathVariable Integer productId) {
	this.productService.deleteProductById(productId);
}

}
