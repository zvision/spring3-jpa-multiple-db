package com.se.alaf.multiple.api.model.customer;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CUSTOMER_TB")
public class Customer {

	@Id
	private long id;

	@NonNull
	private String firstName;

	private String lastName;

	@NonNull
	private String email;
	
	
}
