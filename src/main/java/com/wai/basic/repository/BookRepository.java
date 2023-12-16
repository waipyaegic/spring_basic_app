package com.wai.basic.repository;

import org.springframework.data.repository.CrudRepository;

import com.wai.basic.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	
}
