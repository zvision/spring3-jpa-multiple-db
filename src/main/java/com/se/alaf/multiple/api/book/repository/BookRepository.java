package com.se.alaf.multiple.api.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.alaf.multiple.api.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
