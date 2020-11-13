package com.example.apirestspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirestspring.model.Order;
import com.example.apirestspring.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = OrderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order obj = OrderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
