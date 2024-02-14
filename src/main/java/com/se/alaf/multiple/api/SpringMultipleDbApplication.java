package com.se.alaf.multiple.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se.alaf.multiple.api.book.repository.BookRepository;
import com.se.alaf.multiple.api.customer.repository.CustomerRepository;
import com.se.alaf.multiple.api.model.book.Book;
import com.se.alaf.multiple.api.model.customer.Customer;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringMultipleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultipleDbApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void addData2DB() {
		bookRepository.saveAll(Stream.of(new Book(111, "Core Java", 295), new Book(222, "Spring Boot", 395))
				.collect(Collectors.toList()));

		customerRepository
				.saveAll(Stream
						.of(new Customer(1, "Graham", "Bell", "graham.bell@abc.com"),
								new Customer(2, "Thomas", "Edison", "thomas.edison@abc.com"))
						.collect(Collectors.toList()));

	}

}
