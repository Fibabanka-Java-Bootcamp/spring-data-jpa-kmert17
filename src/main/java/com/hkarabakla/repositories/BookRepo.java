package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface BookRepo extends CrudRepository<Book, Integer> {

    Set<Book> findByName(String name);

    Set<Book> findAllByNameContainingIgnoreCase(String name);

}
