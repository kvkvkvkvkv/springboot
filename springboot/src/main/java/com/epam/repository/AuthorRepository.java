package com.epam.repository;

import org.springframework.data.repository.CrudRepository;

import com.epam.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
