package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;
// <Tipo da entidade / Tipo do ID da entidade>
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	


}
