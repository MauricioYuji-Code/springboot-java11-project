package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;
// <Tipo da entidade / Tipo do ID da entidade>
public interface UserRepository extends JpaRepository<User, Long> {
	
	


}
