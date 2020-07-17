package com.springboottuto.camunda.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class ProductController {

	private static List<String> products = new ArrayList<>();
	
	static {
		products.add("Sumsung");
		products.add("LG");
		products.add("Lenevo");
		products.add("Iphone");
	}
	@GetMapping("/product/{prd}")
	public String displayProduct( @PathVariable("prd") String prd) {
		
		if(products.contains(prd)) {
			return prd;
		}
		
		return "Product not exist";
		
	}
	
	@GetMapping("/product/add/{prd}")
	public String addProduct( @PathVariable("prd") String prd) {
		
		if(products.contains(prd)) {
			return prd;
		}
		
		return "new :" + prd;
		
	}
}
