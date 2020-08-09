package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;


//camada de serviços (intermediario entre a controler e o repositorio)
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	//retorna lista de usuarios
	public List<Category>findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);
		
		return obj.get();
		
	}

}
