package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.User;
import com.hkarabakla.entities.Author;
import com.hkarabakla.repositories.AuthorRepo;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {

    private final AuthorRepo repo;

    public AuthorService(AuthorRepo repo) {
        this.repo =  repo;
    }

    public void authorOperations() {

        System.out.println(repo.findAllByNameContainingIgnoreCase("le"));
        System.out.println("Book: " + repo.findByName("Huxley"));

    }
}
