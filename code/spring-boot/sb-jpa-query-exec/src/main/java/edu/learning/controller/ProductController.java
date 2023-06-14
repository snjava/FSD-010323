package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Product;
import edu.learning.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product prod) {
		repository.save(prod);
		return "Product Created Successfully...";
	}
	
	@GetMapping("/get-product-by-qty")
	public List<Product> getProductByQty(@RequestParam int qty) {
		//return repository.getProductByQtyHQL(qty);
		return repository.getProductByQtySQL(qty);
	}
	
	
}




