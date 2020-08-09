package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;
// <Tipo da entidade / Tipo do ID da entidade>
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	


}
