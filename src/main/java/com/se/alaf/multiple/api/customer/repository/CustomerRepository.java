package com.se.alaf.multiple.api.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.alaf.multiple.api.model.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
