package com.wai.basic.repository;

import org.springframework.data.repository.CrudRepository;

import com.wai.basic.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
