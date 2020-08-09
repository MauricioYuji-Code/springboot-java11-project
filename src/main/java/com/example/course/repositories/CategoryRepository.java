package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;
// <Tipo da entidade / Tipo do ID da entidade>
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	


}
