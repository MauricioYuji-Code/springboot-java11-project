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
		//va diretamento ao banco de dados
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
		
	}
	//retorna os usuarios salvos 
	public User insert (User obj) {
		//ja me retorna o objeto salvo
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		//intancia usuario, ira deixar o objeto monitorado pelo jpa
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
