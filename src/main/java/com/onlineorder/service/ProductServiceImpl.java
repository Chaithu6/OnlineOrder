package com.onlineorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineorder.dao.ProductDAO;
import com.onlineorder.entities.Product;
import com.onlineorder.exceptions.ProductNotFoundException;




@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDao;

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();

	}

	@Override
	public Product getProductById(Integer productId) throws ProductNotFoundException{
		Product p;
		if(productDao.findById(productId).isEmpty()) {
			throw new ProductNotFoundException();
		}
		else {
			p=productDao.findById(productId).get();
		}
		return p;
	}


	@Override
	public Product addProduct(Product product) {
		productDao.save(product);
		return product;
		
	}

	@Override
	public Product updateProduct(Product product) {
		productDao.save(product);
		return product;
		
	}

	@Override
	public void deleteProductById(Integer productId) {
		Product t =productDao.getById(productId);
		productDao.delete(t);
		
	}

}
