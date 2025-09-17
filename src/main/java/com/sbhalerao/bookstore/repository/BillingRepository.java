package com.sbhalerao.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbhalerao.bookstore.model.Customer;

@Repository
public interface BillingRepository extends CrudRepository<Customer, Long> {

}
