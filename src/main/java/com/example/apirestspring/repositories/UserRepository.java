package com.example.apirestspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirestspring.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
