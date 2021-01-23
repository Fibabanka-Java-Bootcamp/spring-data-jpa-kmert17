package com.hkarabakla.repositories;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface AuthorRepo extends CrudRepository<Author, Integer> {

    Set<Author> findByName(String name);

    Set<Author> findAllByNameContainingIgnoreCase(String name);

}
