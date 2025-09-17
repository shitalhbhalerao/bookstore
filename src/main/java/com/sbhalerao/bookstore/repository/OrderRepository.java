package com.sbhalerao.bookstore.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.sbhalerao.bookstore.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

	ArrayList<Order> findByOrderDate(LocalDate term);
	
	ArrayList<Order> findOrdersById(Long id);

}
