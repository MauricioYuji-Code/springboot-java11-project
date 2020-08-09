package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Category;
import com.example.course.services.CategoryService;

//Disponibilzar um recurso web correspondente a entidade user (recursos) -> controlers rest
//controlador rest

@RestController
@RequestMapping(value = "/categories") // caminho do meu recurso (relacionado a minha entidade user)
public class CategoryResource {
	@Autowired
	private CategoryService service;
	// end point para acessar os usuarios

	// retornar respostas de requisicoes web
		
	
	//responde o tipo get do http (GetMapping)
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {

		//Category u = new Category(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		List<Category> list = service.findAll();
		// ok -> para retornar caso a funcao funcione com sucesso
		// body -> corpo da resposta do usuario "u"
		
		

		return ResponseEntity.ok().body(list);

	}
	
	//Parametro -> value = "/{id}" para ser alocado na url e realizar a busca pelo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findNyId(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
