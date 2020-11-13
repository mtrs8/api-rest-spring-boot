package com.example.apirestspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirestspring.model.Order;
import com.example.apirestspring.model.User;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	
}
