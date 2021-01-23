package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    private final BookRepo repo;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    public void bookOperations() {

        System.out.println(repo.findAllByNameContainingIgnoreCase("le"));
        System.out.println("Book: " + repo.findByName("Lectures on Physics"));

    }
}
