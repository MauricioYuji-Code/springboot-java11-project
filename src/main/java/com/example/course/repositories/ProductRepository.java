package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;
// <Tipo da entidade / Tipo do ID da entidade>
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	


}
