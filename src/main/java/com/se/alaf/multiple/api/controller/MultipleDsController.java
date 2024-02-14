package com.se.alaf.multiple.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.alaf.multiple.api.book.repository.BookRepository;
import com.se.alaf.multiple.api.customer.repository.CustomerRepository;
import com.se.alaf.multiple.api.model.book.Book;
import com.se.alaf.multiple.api.model.customer.Customer;

@RestController
@RequestMapping(value="/api/v1")
public class MultipleDsController{

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CustomerRepository customerRepository;

	
	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}


}
