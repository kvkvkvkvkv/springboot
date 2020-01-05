package com.epam.repository;

import org.springframework.data.repository.CrudRepository;

import com.epam.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
