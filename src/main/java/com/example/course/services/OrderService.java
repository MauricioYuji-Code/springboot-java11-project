package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;


//camada de serviços (intermediario entre a controler e o repositorio)
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//retorna lista de usuarios
	public List<Order>findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
		
	}

}
