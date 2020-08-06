package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

//Disponibilzar um recurso web correspondente a entidade user (recursos) -> controlers rest

@RestController
@RequestMapping(value = "/users") // caminho do meu recurso (relacionado a minha entidade user)
public class UserResource {

	// end point para acessar os usuarios

	// retornar respostas de requisicoes web
		
	
	//responde o tipo get do http (GetMapping)
	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");

		// ok -> para retornar caso a funcao funcione com sucesso
		// body -> corpo da resposta do usuario "u"

		return ResponseEntity.ok().body(u);

	}

}
