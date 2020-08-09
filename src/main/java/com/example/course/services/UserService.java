package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;


//camada de serviços (intermediario entre a controler e o repositorio)
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//retorna lista de usuarios
	public List<User>findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
		
	}

}
