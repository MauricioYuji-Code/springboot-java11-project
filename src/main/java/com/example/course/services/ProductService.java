package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;


//camada de serviços (intermediario entre a controler e o repositorio)
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//retorna lista de usuarios
	public List<Product>findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
		
	}

}
